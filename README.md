# Baseball 프로그램

### 테이블 생성
```sql
create table stadium(
    id int primary KEY auto_increment,
    name varchar(20),
    createdAt TIMESTAMP
);

create table team(
    id int primary KEY auto_increment,
    name varchar(20),
    stadium_id INT,
    createdAt TIMESTAMP
);

create table player(
    id int primary KEY auto_increment,
    name varchar(20),
    position VARCHAR(20),
    team_id INT,
    is_outer BOOLEAN,
    createdAt TIMESTAMP
);
```

### 더미데이터 추가
```sql
INSERT INTO stadium(NAME, createdAt) VALUES('사직야구장', NOW());
INSERT INTO stadium(NAME, createdAt) VALUES('잠실야구장', NOW());
INSERT INTO stadium(NAME, createdAt) VALUES('고척야구장', NOW());
INSERT INTO team(NAME, stadium_id, createdAt) VALUES('롯데', 1, NOW());
INSERT INTO team(NAME, stadium_id, createdAt) VALUES('두산', 2, NOW());
INSERT INTO team(NAME, stadium_id, createdAt) VALUES('키움', 3, NOW());
INSERT INTO player(NAME, position, team_id, is_outer, createdAt) VALUES('이대호', '1루수', 1, 0,NOW());
INSERT INTO player(NAME, position, team_id, is_outer, createdAt) VALUES('홍길동', '외야수',2, 0,NOW());
INSERT INTO player(NAME, position, team_id, is_outer, createdAt) VALUES('장보고', '투수', 3, 0,NOW());
COMMIT;
```

### Tip

#### MariaDB auto commit 해제 하기
```sql
show variables like 'autocommit%';
SET AUTOCOMMIT = FALSE;
```