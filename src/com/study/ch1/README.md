# 1. Stack

## 과제

- 스택 개념 정리하기 (스택 원리, ADT 등)
- 스택 구현하기 (클래스 내부에 배열을 이용한 방법)

1. 클라이언트(Main)에서 다음과 같이 사용할 수 있도록 Stack을 구현하기.
```java
public static void main(String[] args) {
	Stack stack = new Stack(100);
	stack.push(100);
	stack.push(200);
	
	while (!stack.isEmpty()) {
		sout(stack.pop());
	}
}
```

2. 개선사항
```java
Stack stack = new Stack(100); // 이렇게 매번 100개를 할당해주기보다

Stack stack = new Stack(); // 이렇게 하면 기본적으로 100개를 할당해주는 방법이 있을까?
```


## 필요한 개념

- 클래스
- 메소드
- 생성자
- 스택의 개념
