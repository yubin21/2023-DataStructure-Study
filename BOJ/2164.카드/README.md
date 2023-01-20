## 2164: 카드
### 문제와 관련된 개념
#### Queue의 선언  
자바에서 LinkedList Queue를 사용하는 이유  

`ArrayList` : 배열과 상당히 유사. 하지만 추가/삭제가 가능. but 동적으로 늘어나는 것이 아닌, 배열이 추가되는 형태.  
→ ArrayList 생성시, 초기값을 지정해주는 것이 좋다. 

`LinkedList` :  내부적으로 양방향의 연결 리스트로 구성. → 참조하려는 원소에 따라 처음부터 순방향으로 또는 역순으로 순회할 수 있다. (배열의 단점을 보완하기 위해 고안)

**순차적으로 데이터를 추가/삭제 하는 경우에는 ArrayList를 사용하고, 처음, 중간 데이터를 추가/삭제하는 경우에는 LinkedList를 사용하는 것이 좋다.**  

#### 값 추가
1. add()
- 해당 큐 맨 뒤에 값 삽입
- 값 추가 성공 시 true 반환
- 큐가 꽉 찬 경우 IllegalStateException 에러 발생
2. offer()  
- 해당 큐 맨 뒤에 값 삽입
- 값 추가 성공 시 true 반환
- 값 추가 실패 시 false 반환

#### 값 제거
1. remove()
- 큐 맨 앞에 있는 값 반환 후 삭제
- 큐가 비어 있는 경우 NoSuchElementException 에러 발생
2. poll()
- 큐 맨 앞에 있는 값 반환 후 삭제
- 큐가 비어있을 경우 null 반환
3. clear()
- 큐 비우기

#### 맨 앞 값 확인
1. element()
- 큐의 맨 앞에 있는 값 반환
- 큐가 비어 있는 경우 NoSuchElementException 에러 발생
2. peek()
- 큐의 맨 앞에 있는 값 반환
- 비어있을 경우 null 반환

문제 상황 발생시 에러 발생인지, 혹은 Null이나 false 반환인지의 차이를 가진다.   
출처  
[ArrayList vs LinkedList](https://github.com/wjdrbs96/Today-I-Learn/blob/master/Java/Collection/List/ArrayList%20vs%20LinkedList.md)  
[[JAVA] Queue(큐) 사용법 (add vs offer / remove vs poll / element vs peek)](https://cocoon1787.tistory.com/774)
### 문제 풀이
큐를 만든 뒤, 반복문을 통해 1부터 n까지의 값을 넣는다. 그 후 큐가 1보다 클때까지(=한 장 남을때까지) 카드 제거와 위 카드를 가장 아래로 옮기는 (`q.offer(q.poll());`)것을 반복한다.
### Trouble Shooting
문제 풀이시 큐를 사용할지 스택을 사용할지에 대한 이해가 아직도 부족하여, 처음에 스택으로 시도하였다가 이후에 변경하였다.  

**문제 출처**  
[2164번: 카드2](https://www.acmicpc.net/problem/2164)