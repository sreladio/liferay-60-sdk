create table Z_Member (
	memberId LONG not null primary key,
	memberFirstName VARCHAR(75) null,
	memberLastName VARCHAR(75) null,
	memberPhoneNumber VARCHAR(75) null
);

create table Z_PhoneNumber (
	numberId VARCHAR(75) not null primary key
);