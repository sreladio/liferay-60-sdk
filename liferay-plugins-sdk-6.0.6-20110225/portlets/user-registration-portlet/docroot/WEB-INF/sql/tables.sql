create table ME_member (
	memberId LONG not null primary key,
	memberFirstName VARCHAR(75) null,
	memberLastName VARCHAR(75) null,
	membrePhoneNumer LONG,
	memberEmail VARCHAR(75) null,
	companyId LONG,
	groupId LONG
);

create table US_USMember (
	memberId LONG not null primary key,
	memberFirstName VARCHAR(75) null,
	memberLastName VARCHAR(75) null,
	memberPhoneNumber VARCHAR(75) null,
	memberEmail VARCHAR(75) null,
	memberBirthDate DATE null,
	companyId LONG,
	groupId LONG
);