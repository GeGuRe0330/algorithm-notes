# Stream (IntStream, Stream<Integer>)

> 배열·컬렉션의 원소를 "흘려보내면서" 거르고(`filter`), 합치고(`reduce`), 세는(`count`) 등의 처리를 연결(chain)해서 쓰는 방식.

- 처리 흐름은 **만들기 → 중간 연산 → 끝 연산** 순이다.
  - 만들기: `Arrays.stream(arr)`, `IntStream.range(0, n)`
  - 중간 연산: `filter` 등. 스트림을 돌려줘서 이어 쓸 수 있다.
  - 끝 연산: `count`, `sum`, `max`, `min`, `reduce`, `findFirst` 등. 값을 돌려주고 스트림을 끝낸다.
- `int[]`는 `Arrays.stream(arr)`로 `IntStream`이 된다. (`Array.stream`이 아니라 **`Arrays`**)
- 스트림은 **한 번만** 쓸 수 있다. 끝 연산을 한 번 하면 다시 못 쓴다.

## 자주 쓰는 메서드

| 메서드 | 하는 일 | 반환형 |
|---|---|---|
| `filter(x -> 조건)` | 조건이 참인 원소만 남김 | `IntStream` |
| `count()` | 남은 원소의 **개수** | `long` |
| `sum()` | 원소의 **합** | `int` |
| `max()` / `min()` | 최댓값 / 최솟값 | `OptionalInt` |
| `reduce(초기값, (x, y) -> ...)` | 원소를 하나씩 규칙으로 합침 | `int` |
| `findFirst()` | 첫 원소 | `OptionalInt` |

```java
int[] arr = {5, 3, 8, 3};

Arrays.stream(arr).filter(x -> x == 3).count();        // 2   (3인 것의 개수)
Arrays.stream(arr).sum();                               // 19
Arrays.stream(arr).max().getAsInt();                    // 8
Arrays.stream(arr).filter(x -> x != 3).reduce(1, (x, y) -> x * y);  // 5 * 8 = 40
```

## 주의점

- **`Optional` 상자:** `max()`, `min()`, `findFirst()`는 값이 없을 수도 있어서 `OptionalInt`에 담겨 나온다. 꺼낼 땐 `getAsInt()` 또는 `orElse(기본값)`.
- **`count()`는 `long`:** `int`에 담으려면 `(int)`로 형변환해야 한다.
- **`reduce`의 초기값:** 더하기는 `0`, 곱하기는 `1`. 연산에서 아무것도 바꾸지 않는 값을 넣는다. 곱셈에 `0`을 넣으면 항상 0이 된다.
- **인덱스는 안 준다:** `filter`/`findFirst`는 **값**을 줄 뿐 위치(인덱스)를 주지 않는다. 인덱스가 필요하면 `IntStream.range(0, arr.length).filter(i -> arr[i] == 3).findFirst()`처럼 인덱스를 스트림으로 만든다.
- **람다 안의 지역 변수:** 람다에서 바깥 지역 변수를 쓰려면 그 변수가 **한 번만 값이 정해져야** 한다(effectively final). 값이 바뀌는 변수는 새 변수에 복사해서 쓴다.

```java
int pair = p;                          // p는 반복문에서 바뀌므로 복사
... .filter(i -> i != pair)            // OK. p를 직접 쓰면 컴파일 에러
```

## `List`에서 쓰는 스트림 (`Stream<Integer>`)과 `removeIf`

`int[]`는 `Arrays.stream(arr)`로 `IntStream`이 되고, `List<Integer>`는 `list.stream()`으로 **`Stream<Integer>`**가 된다. 흐름은 같지만 몇 가지가 다르다.

| | `IntStream` (`int[]`) | `Stream<Integer>` (`List<Integer>`) |
|---|---|---|
| 만들기 | `Arrays.stream(arr)` | `list.stream()` |
| 합 | `sum()` 바로 가능 | `sum()` 없음. `reduce(0, Integer::sum)` 또는 `mapToInt(x -> x).sum()` |
| 최대·최소 | `max()` / `min()` | `max(Integer::compare)`처럼 비교 규칙을 줘야 한다 |

```java
List<Integer> list = new ArrayList<>(List.of(5, 8, 3));

list.stream().reduce(0, Integer::sum);             // 16
list.stream().reduce(0, (x, y) -> x + y);          // 16  (위와 같은 뜻)
list.stream().mapToInt(x -> x).sum();              // 16  (IntStream으로 바꿔서)
```

- **`Integer::sum`:** `(x, y) -> x + y`를 짧게 쓴 **메서드 참조**다. "두 개를 받아 합치는 메서드"를 이름으로 가리킨다.
- **`removeIf(num -> 조건)`:** 리스트에서 조건이 참인 원소를 **그 자리에서** 지운다. 스트림이 아니라 리스트의 메서드다.

```java
list.removeIf(num -> num == 8);                    // [5, 3]
```

- **주의 (수정 가능한 리스트만):** `List.of(...)`나 `Arrays.asList(...)`로 만든 리스트는 크기를 바꿀 수 없어서 `removeIf`에서 `UnsupportedOperationException`이 날 수 있다. `new ArrayList<>(...)`로 감싸서 쓴다.
- **람다의 바깥 변수:** `for (int i : numbers) { list.removeIf(num -> num == i); }`의 `i`는 반복마다 값이 한 번만 정해지는 변수라서 람다에서 쓸 수 있다. (위 "람다 안의 지역 변수" 규칙과 같다.)

## 이 레포에서 쓴 문제
- lv0/p05 주사위 게임 3: 눈 개수 배열의 `max()`, 한 쌍을 뺀 나머지의 `filter` + `reduce`, 모두 다를 때 `min()`
- lv1/p07 제일 작은 수 제거하기: `Arrays.stream(arr).min().getAsInt()`로 최솟값 찾기
- lv1/p08 없는 숫자 더하기: `0~9` 리스트에서 `removeIf`로 있는 숫자 지우기, 남은 값을 `list.stream().reduce(0, Integer::sum)`으로 합산

## 직접 추가할 메모
-
