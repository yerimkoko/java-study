# 4. Stack

### 문제사항

- 만약에 스택이 비어있는 상태에서 pop()을 요청하면 어떻게 해야할까?
- 만약에 할당된 배열의 갯수를 초과해서 push()를 하면 어떻게 해야할까?

## 과제 1
다음과 같이 적절한 에외처리 하기.
```java
public static void main(String[] args) {
	Stack<Integer> stack = new Stack<>(2); // 3개
	stack.push(100);
	stack.push(200);
	stack.push(300); // 2개를 초과했을때 어떻게 해야할까?
	
	while (!stack.isEmpty()) {
		sout(stack.pop());
	}
	sout(stack.pop()); // 스택이 비어있는 상태에서 pop()을 요청하면 어떻게 해야할까?
}
```


## 필요한 개념

- Exception이란?
- 일반 예외 vs 런타임 예외란?