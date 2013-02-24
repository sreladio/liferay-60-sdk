create index IX_8FEAE321 on ME_member (companyId);
create index IX_1363BDE3 on ME_member (groupId);
create index IX_D8C00192 on ME_member (groupId, memberLastName);

create index IX_F89835E9 on US_USMember (companyId);
create index IX_AB5722AB on US_USMember (groupId);
create index IX_8A20D65A on US_USMember (groupId, memberLastName);