# 2. Stack

## 문제사항

- 지금까지는 스택에 정수형(int)만 넣을 수 있었음.
- 근데 String도 넣고 싶고, Double형도 넣고 싶으면 어떻게 해야할까?


## 과제
클라이언트(Main)에서 다음과 같이 사용할 수 있도록 Stack을 구현하기.

```java
public static void main(String[] args) {
	Stack<Integer> stack = new Stack(10);
	stack.push(100);
	stack.push(200);
	stack.push(300);
	
	while (!stack.isEmpty()) {
		sout(stack.pop());
	}
	
	Stack<String> stack2 = new Stack(10);
	stack2.push("고예리임");
	stack2.push("강승호오");
	stack2.push("지짜");
	
	while (!stack2.isEmpty()) {
		sout(stack2.pop());
	}
}
```


## 필요한 개념

- 제네릭
- 기본 타입 vs Wrapper 타입
- 오토 박싱, 오토 언박싱