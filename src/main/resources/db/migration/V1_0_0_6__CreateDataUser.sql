insert into security.roles(role_id, role_name, created_by, created_date) VALUES
    ('18001030','Administrator', 'migration', now()),
    ('07160934','Operator','migration', now());

insert into security.users(user_id, username, password, is_active, created_by, created_date) VALUES
    ('0001','admin','admin',TRUE,'migration', now()),
    ('0002','deni','deni',FALSE,'migration', now());

insert into security.user_roles(user_id, role_id) VALUES
('0001', (SELECT role_id from security.roles where role_name = 'Administrator')),
('0001', (SELECT role_id from security.roles where role_name = 'Operator')),
('0002', (SELECT role_id from security.roles where role_name = 'Operator'));
