<div align="center">

  # **데이터 분석과 예측모델링 웹서비스 개발 과정**
</div>

 <div align="center">

 ## **축산물 가격 비교 및 판매/레시피 커뮤니티 서비스**
 </div>
<br>

### **🍖프로젝트 명**
**meatmeet**

<br>

### ⏰**개발 기간**
2023.05.30 ~ 2023.07.04

<br>

### **🏃개발 인원**
4명

<br>

### **🖥️담당 업무**
**Front (레시피 페이지)**  
- 상세 페이지
- 글 작성 페이지
- 글 수정 페이지
- index 페이지 데이터 분석 시각화

**Back (레시피 페이지)**  
- 레시피 조회
- 장바구니에 상품 추가
- 댓글 기능
- 레시피 글 조회 수 
- 회원가입 시 아이디 중복 확인 및 유효성 검사 
- 로그인 시 아이디 및 비밀번호 확인

<br>

### ⚙️**개발 환경**
Windows 10, Spring Boot 2.7.12, Eclipse, Gradle, Java 11.0.16.1, python3.8.10, MySQL, HTML, CSS, JS, Thymeleaf, Lombok, GitHub, Git

<br>

### 📌**설계 배경**
일별로 달라지는 축산물 가격 정보 제공 및 레시피 공유가 가능한 커뮤니티

<br>

### 🛠️**설계 목적**
- 축산물의 전일대비 가격정보 제공 및 판매
- 레시피 커뮤니티를 통해 사이트 방문 유도

<br>

### ✨**기대 효과**
매출 향상, 브랜드 이미지 향상

<br>

### 👪**서비스 대상**
요리에 관심이 많은 2, 30대 여성

<br>
<hr>
<br>

### 📈**ERD**
<img src="https://github.com/mj0718/meatmeet/assets/109218705/66104bfb-52d8-4fa9-80df-6895879a128e" width="600" height="400">

### 📋**REST API**
<img src="https://github.com/mj0718/meatmeet/assets/109218705/92fb65f6-0a71-46c9-a28f-e14ada51d0da" width="700" height="500">

### 🔍**주요 기능**
⭐**축산물 일별 가격 정보**
- 가격 정보 시각화 (선 그래프)

<img src="https://github.com/jeongEEEun/meatmeet/assets/109218705/dd1bb88d-d1cf-4d87-ba58-c5d21eda190c" width="600" height="800">
  
<br><hr><br>

⭐**회원가입 및 로그인**
- 회원가입 시 유효성 검사 및 아이디 중복 검사 진행 

<img src="https://github.com/jeongEEEun/meatmeet/assets/109218705/c968c79c-3ebe-4b91-a362-53e391649c8b" width="400" height="300">

<br><br>

- 로그인 시 아이디 및 비밀번호 확인

<img src="https://github.com/jeongEEEun/meatmeet/assets/109218705/e6f0acf5-4bf9-48bc-bcd6-8f3b44d1fe17" width="400" height="300">

<br><hr><br>

⭐**카테고리별 레시피 조회**
- 돼지, 소, 닭, 계란, 우유로 카테고리를 분류한 후 그에 해당하는 레시피 조회 가능
- 카테고리별 레시피 페이지에서 해당 상품 장바구니에 담기

<img src="https://github.com/jeongEEEun/meatmeet/assets/109218705/699f0886-22fc-4fcc-9e94-1f64a2e03991" width="500" height="300">

<br><hr><br>

⭐**댓글 작성**
- 레시피 상세 페이지에서 해당 레시피에 대한 댓글 작성

<img src="https://github.com/jeongEEEun/meatmeet/assets/109218705/fa4d2ef9-13ef-4cd3-8145-66e65dee91fb" width="400" height="400">

<br><hr><br>

### 📅**추후 작업**
💡댓글 기능 추가 작업
- 사용자가 작성한 댓글 수정/삭제
- 답글 기능 추가

💡관리자 페이지 추가
- 주문 관리(주문 확인, 취소)
- 레시피 게시판 관리

💡상품 상세 페이지
- 리뷰 및 제품 상세 정보 제공

💡회원 정보 관리
- 주문 시 입력한 정보(주소, 전화번호 등) 저장/수정 기능
- 가입 시 입력한 정보 수정

<br>

### [참고 발표 자료](https://github.com/mj0718/meatmeet/blob/main/MEATMEET_%EB%B0%9C%ED%91%9C%EC%9E%90%EB%A3%8C.pdf)
### [시연영상](https://github.com/mj0718/meatmeet/blob/main/%EC%8B%9C%EC%97%B0%EC%98%81%EC%83%81.mp4)
