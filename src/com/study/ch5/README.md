# 5. Queue

중간고사 크크크

## 과제
지금까지 공부한 것을 바탕으로 큐 구현하기.
```java
public static void main(String[] args) {
	// 배열을 이용한 큐 구현
	Queue<String> queue = new ArrayQueue<>();
	queue.enqueue("고예리임");
	queue.enqeuue("크크크크크");

	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());

	// 리스트를 이용한 큐 구현
	Queue<String> queue = new ListQueue<>();
	queue.enqueue("고예리임");
	queue.enqeuue("크크크크크");

	System.out.println(queue.dequeue());
	System.out.println(queue.dequeue());
}
```

## 구현하기 위해 필요한 개념들

- 클래스, 메소드, 생성자
- 인터페이스, 추상화, 오버라이딩
- 큐 (순환 큐)
- 제네릭
- 컬렉션 프레임워크
- 예외 처리