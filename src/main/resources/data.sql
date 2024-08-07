CREATE TABLE `company` (
	`comp_id`	VARCHAR(100)	PRIMARY KEY,
	`comp_name`	VARCHAR(100)	NOT NULL,
	`country`	VARCHAR(100)	NOT NULL,
	`region`	VARCHAR(100)	NOT NULL
);

CREATE TABLE `user` (
	`user_id`	VARCHAR(20)	PRIMARY KEY,
	`user_name`	VARCHAR(50)	NOT NULL,
	`rc_id`	        LONG	        NOT NULL
);

CREATE TABLE `recruitment` (
	`rc_id`	    LONG	   PRIMARY KEY,
	`position`  VARCHAR(50)    NOT NULL,
	`reward`    LONG	   NOT NULL,
	`details`   VARCHAR(500)   NOT NULL,
	`stack`	    VARCHAR(20)	   NOT NULL,
	`comp_id`   VARCHAR(100)   NOT NULL
);
INSERT INTO recruitment (rc_id, position, reward, details, stack) VALUES ("SM", "백엔드 주니어 개발자")

