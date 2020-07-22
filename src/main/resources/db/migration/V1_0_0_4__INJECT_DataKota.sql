INSERT INTO master_provinsi(kode_provinsi, nama_provinsi, created_date, created_by)
VALUES ('001', 'jawa barat', now(), 'migration'),
       ('002', 'jawa Tengah', now(), 'migration'),
       ('003', 'Jawa Timur', now(), 'migration');
insert into master_kota_kabupaten(kode_kota, nama_kota, created_date, created_by, provinsi_id) VALUES
('001' , 'Kota bandung', now(), 'migration','001'),
('002' , 'Kota tegal', now(), 'migratin','002'),
('003' , 'Kota surabaya', now(), 'migratin','003');
