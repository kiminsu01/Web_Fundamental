create table notice
n_num int primary key auto_increment,
n_writer varchar(100) not null,
n_title varchar(200) not null,
n_content varchar(16384) not null,
n_status char(1) not null, #1�̸� �Ϲݱ�, 2�̸� ������
n_flag char(1) not null, #1�̸� ȸ���������, 2�̸� ȸ����������
n_ip varchar(15)
n_regdate datetime not null,
);