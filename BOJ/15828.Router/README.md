## 15828: Router
### 문제와 관련된 개념
큐 관련 개념은 우측 참조. [2164: 카드](https://github.com/yubin21/2023-DataStructure-Study/tree/main/BOJ/2164.%EC%B9%B4%EB%93%9C)
### 문제 풀이
while문을 통해 반복문을 만든다. 만약 입력된 수가 0인 경우, 큐에서 하나를 지운다. -1인 경우, while문을 빠져나간다. 그 외의 경우 버퍼의 크기와 현재 큐의 크기를 비교하여 버퍼가 더 큰 경우에만 입력을 받는다. 
while문 밖에서는 만약 큐가 비어있다면 empty을 출력하고, 그 외의 경우 for each를 통해 큐에 남아있는 모든 수를 출력한다. 

**문제 출처**  
[15828번: Router](https://www.acmicpc.net/problem/15828)