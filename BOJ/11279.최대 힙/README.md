## 11279: 최대 힙
### 문제와 관련된 개념
우선순위 큐(Priority Queue) 관련 개념은 우측 참조. [1927: 최소 힙](https://github.com/yubin21/2023-DataStructure-Study/tree/main/BOJ/1927.%EC%B5%9C%EC%86%8C%20%ED%9E%99)
### 문제 풀이
기존의 최소 힙과 같은 방식으로 풀되, add()가 아닌 offer()을 사용하여 값을 제거하였고, 우선순위의 정렬 기준을 람다식을 통해 변경하였다. ([참고한 글](https://velog.io/@robolab1902/Java-Priority-Queue-%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98%EC%97%90-%EB%9E%8C%EB%8B%A4%EC%8B%9D-%EC%93%B0%EB%8A%94-%EC%9D%B4%EC%9C%A0%EA%B0%80-%EB%AD%90%EC%95%BC))
### Trouble Shooting
우선순위 큐의 우선순위 조건을 변경하는 것에서 이 정렬 기준을 변경하는 법을 알지 못해 해매었던 것 같다.
**문제 출처**  
[11279번: 최대 힙](https://www.acmicpc.net/problem/11279)