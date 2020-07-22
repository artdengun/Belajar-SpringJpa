create SCHEMA nasabah;

create TABLE nasabah.data_nasabah(
tipe_nasabah CHARACTER VARYING(50),
nasabah_id CHARACTER VARYING(64) not null primary key,
nama_lengkap CHARACTER VARYING(50) not null,
alamat_rumah CHARACTER VARYING(255),
nomor_npwp CHARACTER VARYING(62),
nomor_identitas CHARACTER VARYING(64),
jenis_kelamin CHARACTER VARYING(1)
);