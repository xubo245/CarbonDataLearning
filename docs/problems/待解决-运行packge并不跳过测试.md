使用

	clean package -Pspark-2.1 -Dspark.version=2.1.0
编译一次，/tmp增加文件不少，/tmp大了会报错：Problem while shutdown the server
	
	
	***:/ # du -sh *
	9.2M	bin
	40M	boot
	5.0G	david
	292K	dev
	74M	etc
	4.0K	home
	162M	lib
	19M	lib64
	16K	lost+found
	4.0K	media
	4.0K	mnt
	72K	opt
	du: cannot access `proc/120021/task/120021/fd/4': No such file or directory
	du: cannot access `proc/120021/task/120021/fdinfo/4': No such file or directory
	du: cannot access `proc/120021/fd/4': No such file or directory
	du: cannot access `proc/120021/fdinfo/4': No such file or directory
	0	proc
	2.3G	root
	13M	sbin
	4.0K	selinux
	88K	srv
	0	sys
	939M	tmp
	16K	user
	4.0G	usr
	181M	var
	***:/ # du -sh *
	9.2M	bin
	40M	boot
	5.0G	david
	292K	dev
	74M	etc
	4.0K	home
	162M	lib
	19M	lib64
	16K	lost+found
	4.0K	media
	4.0K	mnt
	72K	opt
	du: cannot access `proc/37523/task/37523/fd/4': No such file or directory
	du: cannot access `proc/37523/task/37523/fdinfo/4': No such file or directory
	du: cannot access `proc/37523/fd/4': No such file or directory
	du: cannot access `proc/37523/fdinfo/4': No such file or directory
	0	proc
	2.3G	root
	13M	sbin
	4.0K	selinux
	88K	srv
	0	sys
	953M	tmp
	16K	user
