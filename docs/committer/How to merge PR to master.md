	git clone https://git-wip-us.apache.org/repos/asf/carbondata  cahnge to git clone https://gitbox.apache.org/repos/asf/carbondata
	cd carbondata
	git remote rename origin apache
	git remote add github https://github.com/apache/carbondata
	git config --local --add remote.github.fetch '+refs/pull/*/head:refs/remotes/github/pr/*'
	
	git remote -v
	git fetch --all
	git checkout -b pr-2 github/pr/2
	git rebase -i apache/master   (-i squash some commits.)
	
	:%s/pick/squash/gc  (快速squash的方法)
	
	pick fda59df commit 1
	squash x536897 commit 2
	squash c01a668 commit 3
	This means, you take the first commit, and squash the following onto it
	
	git log       -- get the commit  info
	git checkout apache/master
	git cherry-pick 0e1c3b09ccc3493ca50a0a41ae993260a9a30493(To be merged PR's commit info)
	
	git commit --amend -m "PR title" -m "PR description" -m "This closes #1062"
	
	git push apache HEAD:master
