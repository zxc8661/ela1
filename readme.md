# 1강
- [커밋](https://github.com/jhs512/kp-2025-04-02/commit/75dacd5)
- 프로젝트 생성

# 2강
- [커밋](https://github.com/jhs512/kp-2025-04-02/commit/855f31a)
- 엘라스틱 서치(노리 애널라이저 활성화 버전)용 docker-compose.yml 생성
- 엘라스틱 서치 API 주소 : http://localhost:9200

# 3강
<<<<<<< HEAD
- [커밋](https://github.com/jhs512/kp-2025-04-02/commit/435d7cf)
=======
- [커밋](https://github.com/jhs512/kp-2025-04-02/commit/e0de6c2)
>>>>>>> 2283e82dadca35e170f596ee9cfd83e8758a0610
- PostDoc, PostDocRepository, PostDocService 생성
- BaseInitData 생성
  - PostDoc 인덱스 재생성
  - 샘플 글 6개 추가
- http://localhost:9200/_cat/indices?v
  - 모든 인덱스 출력
- http://localhost:9200/app1_posts
  - 인덱스 정보 출력
- http://localhost:9200/app1_posts/_settings
  - 인덱스 설정 정보 출력
- http://localhost:9200/app1_posts/_mapping
  - 인덱스 매핑 정보 출력
- http://localhost:9200/app1_posts/_search
  - 인덱스 검색

# 4강

## 제목기준으로 `대학` 이라는 키워드로 검색

## POSTMAN : ela_1/posts/_search
```
POST http://localhost:9200/app1_posts/_search
{
  "query": {
    "match": {
      "title": "대학"
    }
  }
}
```

# 5강
<<<<<<< HEAD

## 
=======
- [커밋](https://github.com/jhs512/kp-2025-04-02/commit/main)
- http://localhost:8080/api/v1/posts/search
>>>>>>> 2283e82dadca35e170f596ee9cfd83e8758a0610
