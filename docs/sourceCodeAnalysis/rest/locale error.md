	root@ecs-909c://xubo/tools# vi /usr/share/i18n/locales/i18n
	root@ecs-909c://xubo/tools# LC_ALL=C
	root@ecs-909c://xubo/tools# export LC_ALL
	root@ecs-909c://xubo/tools# 
	root@ecs-909c://xubo/tools# apt-get install gdm
	Reading package lists... Done
	Building dependency tree       
	Reading state information... Done
	The following package was automatically installed and is no longer required:
	  python3-prettytable
	Use 'apt autoremove' to remove it.
	The following NEW packages will be installed:
	  gdm
	0 upgraded, 1 newly installed, 0 to remove and 96 not upgraded.
	Need to get 0 B/19.6 kB of archives.
	After this operation, 69.6 kB of additional disk space will be used.
	Selecting previously unselected package gdm.
	(Reading database ... 156084 files and directories currently installed.)
	Preparing to unpack .../gdm_3.18.3-0ubuntu2.1_all.deb ...
	Unpacking gdm (3.18.3-0ubuntu2.1) ...
	Setting up gdm (3.18.3-0ubuntu2.1) ...
	root@ecs-909c://xubo/tools# 
	root@ecs-909c://xubo/tools# 
	root@ecs-909c://xubo/tools# vi /etc/profile
	root@ecs-909c://xubo/tools# source /etc/profile
	**********