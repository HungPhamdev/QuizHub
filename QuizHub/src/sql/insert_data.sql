INSERT INTO NGUOIDUNG (USERNAME, MATKHAU, EMAIL, HOTEN, ROLE, createdAt, updatedAt, isDeleted) VALUES
('user1', 'password1', 'user1@example.com', 'Nguyễn Văn A', 'admin', GETDATE(), GETDATE(), 0),
('user2', 'password2', 'user2@example.com', 'Lê Thị B', 'user', GETDATE(), GETDATE(), 0);

INSERT INTO MON (MAMON, TENMON, MOTA, createdAt, updatedAt, isDeleted) VALUES
(1, 'Toán', 'Môn Toán học', GETDATE(), GETDATE(), 0),
(2, 'Văn', 'Môn Ngữ văn', GETDATE(), GETDATE(), 0);

INSERT INTO NGUOIDUNG_MON (MAND, MAMON, createdAt, updatedAt, isDeleted) VALUES
('user1', 1, GETDATE(), GETDATE(), 0),
('user1', 2, GETDATE(), GETDATE(), 0),
('user2', 1, GETDATE(), GETDATE(), 0);

INSERT INTO DETHI (MADT, TIEUDE, MAMON, MUCDO, NGAYTAO, NGUOITAO, createdAt, updatedAt, isDeleted) VALUES
(1, 'Đề thi Toán học', 1, 'Khó', GETDATE(), 'user1', GETDATE(), GETDATE(), 0),
(2, 'Đề thi Ngữ văn', 2, 'Trung bình', GETDATE(), 'user2', GETDATE(), GETDATE(), 0);

INSERT INTO KETQUA (MAKQ, DIEM, NGAYHOANTHANH, USERNAME, MADT, createdAt, updatedAt, isDeleted) VALUES
(1, 8.5, GETDATE(), 'user1', 1, GETDATE(), GETDATE(), 0),
(2, 7.0, GETDATE(), 'user2', 2, GETDATE(), GETDATE(), 0);

INSERT INTO CAUHOI (MACAUHOI, TIEUDE, KIEUCAUHOI, MADT, createdAt, updatedAt, isDeleted) VALUES
(1, 'Câu hỏi 1', 'Trắc nghiệm', 1, GETDATE(), GETDATE(), 0),
(2, 'Câu hỏi 2', 'Tự luận', 2, GETDATE(), GETDATE(), 0);

INSERT INTO LUACHON (MALC, MACAUHOI, TENLUACHON, NOIDUNG, ISCORRECT, createdAt, updatedAt, isDeleted) VALUES
(1, 1, 'Lựa chọn A', 'Nội dung A', 1, GETDATE(), GETDATE(), 0),
(2, 1, 'Lựa chọn B', 'Nội dung B', 0, GETDATE(), GETDATE(), 0),
(3, 2, 'Lựa chọn A', 'Nội dung A', 0, GETDATE(), GETDATE(), 0),
(4, 2, 'Lựa chọn B', 'Nội dung B', 1, GETDATE(), GETDATE(), 0);



