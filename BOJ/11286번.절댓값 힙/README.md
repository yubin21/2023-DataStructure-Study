## 11286: 절댓값 힙
### 문제와 관련된 개념
우선순위 큐(Priority Queue) 관련 개념은 우측 참조. [1927: 최소 힙](https://github.com/yubin21/2023-DataStructure-Study/tree/main/BOJ/1927.%EC%B5%9C%EC%86%8C%20%ED%9E%99)

### 문제 풀이
이전에 풀었던 최소 힙과 비슷하게 풀이하였다. 그러나 최솟값으로 정렬하는 부분이 기억나지 않아, 아래 참조글을 참고하였다. Comparator 클래스를 새롭게 만들어 x에 원래값, y에 절댓값을 넣은 뒤 Comparable을 통해 정렬을 진행하였고, PriorityQueue에서 이 클래스를 사용하여 생성하였다.
### Trouble Shooting
정렬(Comparable의 사용)을 구현하는 것이 기억나지 않아, 글을 참조하였다. 이번 기회에 확실하게 Comparable을 통해 정렬하는 법을 알아두어야겠다. 또, 찾다보니 해당 방법이 아닌 삼항연산자와 Integer.compare()을 통한 정렬법으로 푼 분들도 많았는데, 이렇게 푸는 방법도 알아두어야겠다.  

**참조**  
[Comparable을 사용하여 정렬을 활용한 풀이 1](https://ilmiodiario.tistory.com/127)  
[Comparable을 사용하여 정렬을 활용한 풀이 2](https://code-lab1.tistory.com/142)  
[삼항연산자와 Integer.compare를 활용한 풀이](https://girawhale.tistory.com/25)

**문제 출처**  
[11286번: 절댓값 힙](https://www.acmicpc.net/problem/11286)