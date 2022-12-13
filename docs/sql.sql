show tables;

desc blog;
desc category;
desc post;
desc user;

select * from blog;
select * from category;
select * from post;
select * from user;


select a.user_id as ID, a.title,a.profile,b.no, b.title as categoryTitle,c.title as postTitle, c.content, c.reg_date as regDate
from blog a, category b, post c
where a.user_id= b.id
and b.no=c.category_no;

#-----------------------------------------------------------------------
select * from user;

insert into user values('bbc02131','여관규','1234');
select id, name from user where id = 'bbc02131' and password = '1234';

#-----------------------------------------------------------------------
select* from blog;

select a.user_id as id, a.title, a.profile, b.no, b.title as categoryTitle, c.title as postTitle, c.content, c.reg_date as regDate from blog a, category b, post c	where a.user_id= b.id and b.no=c.category_no;
select user_id,  title, profile from blog where user_id='bbc02131';
insert into blog values('bbc02131', '여관규님의 블러그', '기본 프로필'); 
update blog set title='블로그 이름 변경확인' where user_id='bbc02131';

#-----------------------------------------------------------------------
select * from category;

insert category values(null,'기본 카테고리','bbc02131');

#-----------------------------------------------------------------------
select * from post;

insert into post values(null,"기본 글","내용",now(),1);