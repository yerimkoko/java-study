# 3. Stack

## 문제사항

```java
int arr[]=new int[100];
```

기존의 배열은 초기에 생성할때 다음과 같이 초기에 100개를 할당해주어야하는 문제가 있음. 크기를 동적으로 할당해주고 싶을때 어떻게 해야할까?

## 과제 1

### 기존의 스택 (ch2)을 Client(Main클래스) 변경 없이 Stack 내부의 로직을 변경하기.

```java
public static void main(String[]args){
	Stack<Integer> stack=new Stack(10);
	stack.push(100);
	stack.push(200);
	stack.push(300);

	while(!stack.isEmpty()){
		sout(stack.pop());
	}

	Stack<String> stack2=new Stack(10);
	stack2.push("고예리임");
	stack2.push("강승호오");
	stack2.push("지짜");

	while(!stack2.isEmpty()){
		sout(stack2.pop());
	}
}
```

## 필요한 개념(과제1)

- 컬렉션 프레임워크
- 배열의 단점

---

## 문제사항2

근데 스택을 배열로 구현한 알고리즘이 있을수도 있고 (물론... 배열의 단점으로 잘 안써서 그럴리는 없지만)

컬렉션 프레임워크의 리스트로 구현한 알고리즘이 있을 수도 있음.

## 과제 2

다음과 같이 알고리즘을 바꿔가면서 사용할 수 있도록 구현하기.

```java

public static void main(String[]args){
	Stack<Integer> arrayStack=new ArrayStack();
	arrayStack.push(100);
	arrayStack.push(200);

	while(!arrayStack.isEmpty()){
		sout(arrayStack.pop());
	}

	Stack<Integer> listStack=new ListStack();
	listStack.push(100);
	listStack.push(200);

	while(!listStack.isEmpty()){
		sout(listStack.pop());
	}
}

```

## 필요한 개념 (과제2)

어떻게 하면 이렇게 알고리즘을 변경해가면서 사용할 수 있을까?

- 추상화란 무엇일까?
- 인터페이스를 사용하는 이유
- 전략 패턴 (디자인 패턴)