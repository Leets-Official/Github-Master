# Github-Master

- Leets가 `Github`를 공부하는 레포지토리입니다.

<br>

## 목적

- `Github`를 사용하는 이유는 너무나 명확합니다.
- 화가가 캔버스를 소중히 여기고 작가가 노트를 소중히 여기는 것처럼 GitHub는 개발자의 놀이터입니다.
- `GitHub`는 바로 소프트웨어 개발자를 위한 플랫폼입니다.

<br>

- 가장 중요하게 생각하는 점은 **형상관리**를 위한 `GitHub` 사용입니다.
- 코드를 관리하고 버전을 제어할 수 있는 기능은 개발자에게 있어 아주 중요하고 필요한 기능입니다.
- 모든 커밋과 변경 사항을 문서화하는 것에 더하여 프로젝트에 대한 기록을 남길 수 있습니다.

<br>

- 단순히 취업 포트폴리오를 위해 사용되는 `Github`를 넘어 `Github`과 친해지는 것이 이 레포지토리의 목적입니다.
- 더 나아가 오픈소스 기여, `CI/CD`, 코드리뷰까지 확장되는 성장을 위해 학습합니다.
- 동료와의 협업을 증진하고 더 나은 코드를 위해 고민하며(코드 리뷰) 더 넓은 소프트웨어 생태계에 기여(컨트리뷰터)하는 것을 목표합니다.

<br>

### 대상

- `Github`를 사용하기 어려운 사람
- 협업에서 `Github`를 사용하고 싶은 사람

<br>

### 주제

- 필수 명령어 학습
- Issue, PR, 브랜치에 대한 이해

<br>

### 규칙

- `PR`을 생성한 이후 2명 이상의 `Approve`를 승인 받은 후에 `merge`합니다.
- 컨플릭트가 나는 경우 스스로 해결합니다.

<br>

### 이슈 템플릿

```md
## 1. 무엇을?

<br>

## 2. 상세 설명

<br>

## 3. 추가 사항
```

<br>

### PR 템플릿

```md
## 1. 무슨 이유로 코드를 변경했나요?

<br>

## 2. 관련 스크린샷을 첨부해주세요.

<br>

## 3. 완료 사항

<br>

## 4. 추가 사항

<br>
```

<br>

### 커밋 컨벤션

- [Udacity Conventions](http://udacity.github.io/git-styleguide/)를 사용합니다.

<br>

### 학습 자료

<details>
  <summary>펼쳐 보기</summary>

<br>

# Leets Git 명령어 정리

### 준비물

- IDE (BE: `Intellij`, FE : `VSCode`)
- Github 계정
- Access Token 생성 (`Mac`만 해당)
  1. Github 설정 맨 아래 `Developer settings` 선택
  2. `Personal access tokens` 의 `Tokens(classic)` 클릭
  3. `Generate new token(classic)` 클릭
  4. 이름 적기 + `30days` 선택
  5. 발급
  6. `생성되는 token 카카오톡에 복사`

<br>

![Untitled](https://github.com/Leets-Official/Leets-FE/assets/86355699/37dcfee8-e554-489b-b9bd-6f03a75161fa)

![Untitled 1](https://github.com/Leets-Official/Leets-FE/assets/86355699/4735903c-aa8c-4d29-9565-fbac999c262e)

![Untitled 2](https://github.com/Leets-Official/Leets-FE/assets/86355699/c9864d50-14ec-4e3f-a956-1c633b19ed54)

<br>

### 레포지토리 만들기

- 새로운 레포지토리 만들기

![Untitled 3](https://github.com/Leets-Official/Leets-FE/assets/86355699/1c6abcad-bf81-47a2-8cd7-febb949fabea)

![Untitled 4](https://github.com/Leets-Official/Leets-FE/assets/86355699/6403f771-fb94-4691-b3b8-4495c030252f)

## 디렉터리란?

- 폴더를 의미한다.
- 아래의 `root` , `media`

![Untitled 5](https://github.com/Leets-Official/Leets-FE/assets/86355699/6b9c27f9-9ea1-44ea-afa1-1e1fdb026e21)

<br>

> 💡 아래부터는 `IDE`의 터미널에서 설정

<br>

### 디렉터리 생성

- 깃 저장소를 만들 디렉터리(로컬)를 생성한다.

```bash
mkdir practice
```

<br>

### 해당 디렉터리로 이동하기

- `practice` 디렉터리로 이동

```bash
cd practice
```

<br>

### Git 초기화

- Git을 사용할 수 있도록 디렉터리 초기화
- 폴더(로컬)와 Git 연결

```bash
git init
```

<br>

### `config` 설정 (초기 설정)

```bash
git config --global user.name 이름
git config --global user.email 이메일
```

<br>

### 깃 상태 확인하기

- 변경, 스테이징 상태를 확인할 수 있다.

```bash
git status
```

<br>

## 스테이징이란?(Staging)

- Git에게 버전을 만들 준비를 하라고 알려주는 과정이다.

<br>

![Untitled 6](https://github.com/Leets-Official/Leets-FE/assets/86355699/0e58fb30-9dba-4856-b4a6-2c3b9ac0d120)

<br>

- 로컬에서 변경/추가/제거된 파일이나 코드 ⇒ 원격 저장소로 업데이트할 준비(`Staging`)
- 여러 파일을 스테이징하고 싶다면 파일명 나열 ex) `git add test_git1 test_git2 ...`
- 모든 파일을 스테이징하고 싶다면 `.` 옵션을 추가한다.

```bash
git add practice.js practice.java
```

```bash
git add .
```

<br>

- 모든 파일 스테이징 취소

```bash
git reset HEAD
```

<br>

- 일부 파일 스테이징 취소 (아래의 경우 `README.md`)

```bash
git reset HEAD practice.js practice.java
```

<br>

### 커밋하기(Commit)

- 스테이징 파일을 원격 저장소로 업데이트

```bash
git commit -m "깃헙 연습"
```

<br>

### 커밋 기록 확인하기

- 커밋 기록을 자세하게 확인 가능
- 커밋 ID를 활용하여 구분하며 커밋 메시지 또한 확인할 수 있다.

```bash
git log
```

<br>

- 간단하게 확인하고 싶은 경우 아래 명령어 사용

```bash
git log --oneline
```

<br>

## 원격 저장소(Github)에 연결하기

- 로컬 저장소와 원격 저장소를 연결한다.
- `Github`에서 `HTTPS` 주소를 복사해서 명령어 뒤에 붙여넣는다.

<img width="948" alt="Untitled 7" src="https://github.com/Leets-Official/Leets-FE/assets/86355699/f64d8ccd-70f4-4591-b37d-b625c41a7059">

<br>

```bash
git remote add origin {원격 저장소 HTTPS URL}
```

<br>

### 원격 저장소와의 연결 상태 확인하기

- 제대로 연결되었다면 원격 저장소의 HTTPS 주소가 출력된다.

```bash
git remote -v
```

<br>

### 원격 저장소에 파일 올리기 (동기화, `Synchronize`)

- 로컬 저장소의 커밋 ⇒ 원격 저장소로 올린다. (`push`)
- SSH 키를 생성하여 원격 접속하지 않았다면 Github 로그인 창이 생긴다.

```bash
git push -u origin {브랜치명}
```

<br>

- 레포지토리를 처음 생성한 이후 `push` 하면 IDE는 아래 명령어를 권장한다.

```bash
git push --set-upstream origin {브랜치명}
```

<br>

- 이후엔 `git push` 만 사용하여 `push` 를 진행할 수 있다.

<br>

## 브랜치란?

- 여러 개발자들이 동시에 다양한 작업을 할 수 있게 만들어 주는 기능
- 형상 관리와 안정성을 유지하며 개발하는 Github의 꽃
- `main` , `hotfix` `develop` , `feature` 은 각 브랜치의 이름

<br>

![Untitled 8](https://github.com/Leets-Official/Leets-FE/assets/86355699/6841b3a8-c154-4d68-b2d0-ef8ef68835f8)

<br>

### 브랜치 명령어

- 브랜치 생성하기

```bash
git branch {생성할 브랜치 이름} {기준 브랜치}
git branch newBranch master/main
```

<br>

- `master` 브랜치를 기준으로 `feat/#10/new-feature` 브랜치 생성 (새로운 분기점 생성)

```bash
git branch feat/#10/new-feature master
```

<br>

- 다른 브랜치로 이동하기

```bash
git checkout {이동할 브랜치 이름}
```

<br>

- 브랜치를 생성하며 이동하기

```bash
git checkout -b {브랜치 이름} {기준 브랜치}
```

<br>

- 원격 브랜치 동기화
  - 원격의 브랜치와 로컬의 브랜치 동기화 (원격 브랜치 다운받기)
  - `-p` 옵션은 `prune` 을 의미
  - `fetch` ⇒ 원격에서 이미 삭제된 브랜치는 목록에서 사라짐

```bash
git fetch -p

git fetch

git pull origin master/main
```

<br>

## Issue

- 프로젝트를 진행하면서 발생하는 다양한 이벤트
- 새로운 기능을 추가하거나, 발생한 버그를 수정할 때 사용
- 쉽게 설명하자면 프로젝트의 `Todo` 리스트

<br>

![Untitled 9](https://github.com/Leets-Official/Leets-FE/assets/86355699/37f62b03-8fb9-4cea-92c5-52ed17242545)

<br>

[예시](https://github.com/Leets-Official/Leets-FE/issues)

<br>

## Pull & Request

- `코드를 수정했어.`
- `어때? 잘 작성한 것 같아?`
- `반영해줘`
- 코드 변경 이유에 대해 설명 + (코드리뷰)
  - 이후 브랜치에 `merge` 가능

<br>

![Untitled 10](https://github.com/Leets-Official/Leets-FE/assets/86355699/ad93593c-24e5-4604-b65e-cd0f4a9042b5)

<br>

### 원격 저장소에서 파일 내려받기

- `origin(원격 저장소)`의 내용을 브랜치로 가져온다.
- `origin` 의 `{브랜치명}` 브랜치에 있는 파일들을 현재 브랜치로 병합한다. (`merge`)

```bash
git pull origin {브랜치명}
```

<br>

- 쉽게 말하자면 원격 저장소의 브랜치의 파일을 현재 브랜치와 합치는 과정이다.

<br>

![Untitled 11](https://github.com/Leets-Official/Leets-FE/assets/86355699/88f26389-6b4b-4033-8cdf-1981d3c4e36e)

<br>

## git log 옵션

- 모든 브랜치 커밋 로그 보기

```bash
git log --all
```

<br>

- 커밋과 브랜치 관계를 그래프 형식으로 보기

```bash
git log --graph
```

<br>

- 커밋 로그를 간단하게 한 줄로 보기

```bash
git log --oneline
```

<br>

### 이외 명령어들

- 커밋 되돌리기
  - 로컬 브랜치의 파일을 해당 커밋 전으로 되돌리고 싶은 경우 사용한다. (버전 관리의 이유)
  - hard/mixed/soft 옵션

```bash
git reset --hard {commit id}
git reset --mixed {commit id}
git reset --soft {commit id}
```

<br>

- 원격 저장소의 마지막 커밋 상태로 되돌리는 명령어

```bash
git reset --hard HEAD
```

<br>

- 커밋 간의 파일 변경점 확인하기
  (Commit ID는 앞 4자리만 입력해도 됨)

```bash
git diff {commit1_id} {commit2_id}
```

<br>

[노션 링크](https://www.notion.so/whenevernwhatever/Leets-Git-607066a7cbb240fda65ce06a0a40bdda?pvs=4)  
Made by 김성민([Collection50](https://github.com/Collection50))

</details>
