# 10866: 덱
## 문제와 관련된 개념
### 덱(Deque)
덱(Deque)은 Double Ended Queue의 줄임말로 큐의 양쪽에서 삽입과 삭제를 수행할 수 있는 자료구조이다.
``` java
Deque<Integer> deque = new LinkedList<>();
```
#### 값 삽입
- add()  
마지막에 원소 삽입   
용량 초과 시 예외 발생
- addFirst()  
맨 앞에 원소 삽입  
용량 초과 시 예외 발생
- addLast()   
마지막에 원소 삽입  
용량 초과 시 예외 발생
- offer()  
마지막에 원소 삽입  
삽입 성공 시 true, 용량 제한에 걸리는 경우 false 반환
- offerFirst()  
맨 앞에 원소 삽입  
삽입 성공 시 true, 용량 제한에 걸리는 경우 false 반환
- offerLast()  
마지막에 원소 삽입  
삽입 성공 시 true, 용량 제한에 걸리는 경우 false 반환

#### 값 삭제
- remove()  
맨 앞의 원소 제거 후 해당 원소를 리턴  
덱이 비어있는 경우 예외 발생
- removeFirst()  
맨 앞의 원소 제거 후 해당 원소를 리턴  
덱이 비어있는 경우 예외 발생
- removeLast()  
마지막 원소 제거 후 해당 원소를 리턴  
덱이 비어있는 경우 예외 발생
- poll  
맨 앞의 원소 제거 후 해당 원소를 리턴  
덱이 비어있는 경우 null 리턴
- pollFirst()  
맨 앞의 원소 제거 후 해당 원소를 리턴  
덱이 비어있는 경우 null 리턴
- pollLast()  
마지막 원소 제거 후 해당 원소를 리턴  
덱이 비어있는 경우 null 리턴
#### 원소 확인
- getFirst()  
맨 앞의 원소를 리턴  
덱이 비어있는 경우 예외 발생
- getLast()  
마지막 원소를 리턴  
덱이 비어있는 경우 예외 발생
- peek()  
맨 앞의 원소를 리턴  
덱이 비어있는 경우 null 리턴
- peekFirst()  
맨 앞의 원소를 리턴  
덱이 비어있는 경우 null 리턴
- peekLast()  
마지막 원소를 리턴  
덱이 비어있는 경우 null 리턴

### 버퍼의 사용
BufferedReader와 BufferdWriter는 버퍼를 사용하여 읽기와 쓰기를 하는 함수이다.  
버퍼를 사용하지 않는 입력은, 키보드의 입력이 키를 누르는 즉시 바로 프로그램에 전달된다.  
반면 버퍼를 사용하는 입력은, 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송한다. (버퍼가 가득 차거나 혹은 개행 문자가 나타나면 버퍼의 내용을 한 번에 프로그램에 전달한다.)  
**-> 많은 양의 데이터를 입력받을 경우 BufferedReader를 통해 입력받는 것이 효율면에서 훨씬 낫기 때문이다. (Scanner는 1024 char / Buffered는 그 8배의 버퍼를 가짐) 입력시 Buffer를 활용함으로써 작업속도 차이가 많이 난다.**

#### BufferedReader
Scanner와 달리 BufferedReader는 개행문자만 경계로 인식하고 입력받은 데이터가 String으로 고정된다. 그렇기 때문에 따로 데이터를 가공해야하는 경우가 많다. 하지만 Scanner보다 속도가 빠르다.

#### Read 데이터 공백단위로 데이터 가공
Read한 데이터는 Line단위로 나눠진다. 이를 공백단위로 나누기 위해서는 아래 두가지 방법을 사용할 수 있다.
1. StringTokenizer
   - nextToken() 함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출 할 수 있다.
   ``` java
   StringTokenizer st = new StringTokenizer(s);  // bf.readLine()의 값을 넣음 (int로 형변환 한 데이터)
   int a = Integer.parseInt(st.nextToken());
   int b = Integer.parseInt(st.nextToken());
   ```
   
2. String.split()
   - 배열에 공백 단위로 끊어서 데이터를 넣고 사용할 수 있다.
``` java
String array[] = s.split(" ");  // 공백마다 데이터 끊어서 배열에 넣음
```
   
#### BufferedWriter
적은 양의 출력일 경우 성능차이가 미미하겠지만 많은 양의 출력에서는 입력과 마찬가지로 Buffer를 활용해주는게 좋다.
``` java
BufferWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
String str = "abcde";
bw.write(str); // 출력
bw.newLine();  // 줄바꿈
bw.flush();  // 남아있는 데이터를 모두 출력
bw.close(); // 스트림을 닫음
```
- BufferWriter의 경우 버퍼를 잡았기 때문에 반드시 flush(), close()를 반드시 호출해 주어 뒤처리를 해야한다.
- 자동개행시 `\n` 이 필요하다.

출처  
[[JAVA] Deque(덱) 사용법](https://cocoon1787.tistory.com/795)
[[Java] BufferedReader, BufferedWriter의 입출력에 대해](https://velog.io/@conficker77/Java-BufferedReader-BufferedWriter%EC%9D%98-%EC%9E%85%EC%B6%9C%EB%A0%A5%EC%97%90-%EB%8C%80%ED%95%B4)
[[Java] 빠른 입출력을 위한 BufferedReader, BufferedWriter, StringTokenizer, StringBuilder](https://rlakuku-program.tistory.com/33)
### 문제 풀이
BufferedReader를 통해 값을 입력받는다.(BufferedReader는 한 줄을 입력받으므로, 배열을 통해 split()하여 공백에 따라 값을 나눈다.) 입력된 문장에 따라 덱의 여러 위치에 삽입/삭제/출력을 한다(백준 내 존재하는 명령대로 진행한다).

### Trouble Shooting
BufferedReader에 대한 이해가 부족하여, String을 잘라 string으로 활용하는 법에 대해 다시 알아보았다.

**문제 출처**  
[10866번: 덱](https://www.acmicpc.net/problem/10866)