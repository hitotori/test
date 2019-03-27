set names utf8;
set foreign_key_checks=0;
drop database if exists testgame;

create database if not exists testgame;
use testgame;

drop table if exists user_transaction;

create table user_transaction(
id int not null primary key auto_increment,
login_id varchar(16)unique,
login_pass varchar(16),
user_name varchar(50),
admin_flg varchar(1),
character_name varchar(30),
character_level int,
character_hp int,
character_attack int,
character_defense int,
character_experiencepoint int,
insert_date datetime,
update_date datetime
);

drop table if exists weapon_transaction;

create table weapon_transaction(
id int not null primary key auto_increment,
item_name varchar(16),
item_price int,
item_attack int,
item_defense int,
item_text varchar(40),
insert_date datetime,
delete_date datetime
);

drop table if exists enemy_transaction;

create table enemy_transaction(
id int not null primary key auto_increment,
enemy_name varchar(16),
enemy_hp int,
enemy_attack int,
enemy_defense int,
enemy_experiencepoint int,
insert_date datetime,
update_date datetime
);



INSERT INTO user_transaction(login_id,login_pass,user_name,character_name,character_level,character_hp,character_attack,character_defense,character_experiencepoint)VALUES("1","q","debagger","デバッガー",5,100,50,50,0);
INSERT INTO user_transaction(login_id,login_pass,user_name,admin_flg)VALUES("a","a","manager","〇");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("とがった棒切れ",50,5,1,"少しとがった棒切れ相手に突き刺すと地味に痛い。");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("鉄の剣",200,20,5,"立派な剣、銃刀法に違反しないよう刃はつぶしてある。");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("出刃包丁",1000,28,15,"ホームセンターの最上業物。モンスターだって痛いものは痛い。");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("丸太",3000,40,20,"言わずと知れた最強の武器。みんな、丸太は持ったな。行くぞォォオオ");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("赤いオーバーオール",3980,60,0,"いろんな職種になれる夢の服。高い攻撃力と引き換えに軽い衝撃ですぐ死ぬ。");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("ドラゴンキラー（仮）",10000,77,30,"現実にドラゴンなんていないので本当に特攻がついているかは定かではない。");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("ヘビーセイバー",15000,90,25,"「光」と「軽い」を勘違いしたわけではないよ？…本当だって！");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("△トの剣",25000,120,50,"雷を操れるようになる。今となっては皆電気使ってるんだよなあ。");
INSERT INTO weapon_transaction(item_name,item_price,item_attack,item_defense,item_text)VALUES("無限ロケットランチャー",50000,400,0,"別世界の聖遺物。臭い人たちにのみ最高級の賞賛を得ることだろう。");


INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("ヌフイム",10,10,10,2);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("パンダ",50,18,20,10);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("森の賢人",75,25,30,20);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("ヌフイム改",100,30,30,40);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("トライホーンペガサス",135,40,45,80);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("水陸量尾用マッチョマン",180,55,60,100);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("超合金ゴーレムクロビカリ",250,60,80,150);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("深淵を狩る者",330,80,80,300);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("前勇者ああああ",450,95,100,600);
INSERT INTO enemy_transaction(enemy_name,enemy_hp,enemy_attack,enemy_defense,enemy_experiencepoint)VALUES("ＹＨＶＨ",1500,110,125,2500);