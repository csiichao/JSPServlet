#first README
1��git��������ļ�·����C:\Users\Administrator\.gitconfig

2��git������Կ
	ssh-keygen -t rsa -C "18651882867@163.com"
(/c/Users/Administrator/.ssh/id_rsa)
���룺082499wu
����github
ssh -T git@github.com

3����ʾ�ɹ����ǻ��������⣬��ʱ���ܣ���һ����ʾ����ssh���õ�����
Enter passphrase for key '/c/Users/Administrator/.ssh/id_rsa':
Hi csiichao! You've successfully authenticated, but GitHub does not provide shell access.

4�����ش��뵽���أ�Ĭ���µ�git��װĿ¼
 git clone ��֧��ַ

5���л��������
 cd Hello-World

6������һ��Ŀ¼����ʼ���ֿ⣨����Ŀ¼��Ȼ���ʼ������

	a���½�Ŀ¼�����زֿ�
		��$ mkdir git-tutorial
		��$ cd git-tutorial
	b����ʼ��git�ֿ�
		��$ git init
			ִ�н����Initialized empty Git repository in /Users/hirocaster/github/github-book/git-tutorial/.git/
	�����ʼ���ɹ���ִ���� git init�����Ŀ¼�¾ͻ����� .git Ŀ¼��
	c������ļ������ļ�������ָ���linuxһ��
	touch hello_world.java

7����ȡ�ļ��Ƿ��ύ״̬
 git status
�磺��ʾδ��ӵ�Git�ֿ�
# On branch master
# Untracked files:
# (use "git add <file>..." to include in what will be committed)
#
# hello_world.php
nothing added to commit but untracked files present (use "git add" to track)

8���ύ����
   git add�����Ǹ��๦���������Ŀ���ļ���״̬��ͬ���������Ч��Ҳ��ͬ������������ʼ�������ļ������߰��Ѹ��ٵ��ļ��ŵ��ݴ���������   ���ںϲ�ʱ���г�ͻ���ļ����Ϊ�ѽ��״̬��

������Ҫ��git add�������������ļ��������ʹ��git commit -am����ʡ��ʹ��git add����Ѹ����ļ��ŵ��ݴ����Ĺ���
   ͨ�� git add����ļ������ݴ��� A����ͨ�� git commit�����ύ��
   a��git add �ļ���
   b��git commit -m "Add hello world script by java"  ��
   c��git log����鿴�ύ��־


9��git��������
  a��git?init������ʼ���ֿ⣬ls -lah���Կ���
	ִ���� git init�����Ŀ¼�¾ͻ����� .git Ŀ¼���洢�Ź���ǰĿ¼��������Ĳֿ�����
  b��git?status�����鿴�ֿ��״̬
	 �½����ļ�δ�����κβ�������ʾUntracked files�����ֻ���� Git �ֿ�Ĺ������������ļ�����ô���ļ������ᱻ���� Git �ֿ�İ汾��������У�Ҫ�����ļ���Ϊ Git �ֿ�Ĺ�����󣬾���Ҫ�� git add���������ݴ����� Stage ���� Index���С��ݴ������ύ֮ǰ��һ����ʱ����
  c��git?add�������ݴ���������ļ�
	�� README.md �ļ������ݴ�����git status�������ʾ��������˱仯�����Կ�����README.md�ļ���ʾ�� Changes to be committed�С�
  d��git?commit��������ֿ����ʷ��¼��git commit -m "First commit"��
	-m ������� "First commit"�����ύ��Ϣ���Ƕ�����ύ�ĸ��������� -m��ֱ��ִ�� git commit���ִ�к�༭���ͻ������������ֶ�д��ϸ�ύ��Ϣ����ʽ���£�
	�� ��һ�У���һ�����ּ����ύ�ĸ�������
	�� �ڶ��У�����
	�� �������Ժ󣺼������ĵ�ԭ�����ϸ����
  e��git?log�����鿴�ύ��־
	��ֻ��ʾ�ύ��Ϣ�ĵ�һ�С���git log --pretty=short
	��ֻ��ʾָ��Ŀ¼���ļ�����־����git log Ŀ¼�����ļ���
	����ʾ�ļ��ĸĶ�����git log -p �ļ���
	��鿴����ǰ��Ĳ�𡪡�git?diff
		1���鿴���������ݴ����Ĳ��git?diff����ʱδִ��git add������ʾ���
		2���鿴�������������ύ�Ĳ�𡪡�git?diff HEAD��
			ִ��git add��git?diff����ʾ������ڹ��������ݴ�����״̬���޲�𣬲���ʾ�κν������

10����֧�Ĳ���
	a��git?branch������ʾ��֧һ����
	b��git?checkout?-b�����������л���֧
		�񴴽���Ϊ feature-A �ķ�֧���л�����֧--git checkout -b feature-A
			��git branch feature-A��������֧��---> git checkout feature-A���л���֧��
		���л��� master ��֧����git checkout master
		���л�����һ����֧����git checkout - ��git checkout ��֧��
	c�����Է�֧
		���Է�֧��Topic������˼�壬�Ǽ���ʵ�ֵ�һ���ԣ����⣩������֮�ⲻ�����κ���ҵ�ķ�֧�����ճ������У������ᴴ���������Է�֧��ͬʱ�ڴ�֮���ٱ���һ����ʱ���Է���������ȶ���֧���ȶ���֧�Ľ�ɫͨ���� master ��֧������
		֮ǰ���Ǵ����� feature-A ��֧����һ��֧��Ҫʵ�� feature-A����feature-A ��ʵ��֮�ⲻ�����κ���ҵ�������ڿ��������з����� BUG��Ҳ��Ҫ�ٴ����µķ�֧�����·�֧�н���������
		�����ض��������ҵ�����Է�֧�н��У�������ɺ����� master ��֧�ϲ���ֻҪ��������һ���������̣����ܱ�֤ master ��֧������ʱ���˲鿴������һ��������������Ҳ���Է��Ĵ󵨵ش� master ��֧�����µ����Է�֧��
	d�����ɷ�֧
		���ɷ�֧�Ǹղ����ǽ�������Է�֧��ԭ�㣬ͬʱҲ�Ǻϲ����յ㡣ͨ�����ǻ��� master ��֧��Ϊ���ɷ�֧�����ɷ�֧�в�û�п�����һ��Ĵ��룬������ʱ�����˲鿴����ʱ������Ҫ��������ɷ�֧������������ʽ�����У���ʱ����Ҫ�ñ�ǩ Tag �ȴ����汾��Ϣ��ͬʱ�������汾������ӵ�ж���汾����ʱ�����ɷ�֧Ҳ�ж����
	e��git?merge�����ϲ���֧
		�������л��� master ��֧����git checkout master
		��git merge --no-ff feature-A�����༭��������������¼��ϲ��ύ����Ϣ���˶Ա��沢�˳���
	f��git?log?--graph������ͼ����ʽ�鿴��֧
	g��git?reset����������ʷ�汾
		��1��git log ��ȡĿ��ʱ���Ĺ�ϣֵ
		��git rest --hard ʱ���Ĺ�ϣֵ�����ָ�����ʱ����״̬
	h��git reflog�����鿴��ǰ�ֿ�ִ�й��Ĳ�������־
		git log����ֻ�ܲ鿴�Ե�ǰ״̬Ϊ�յ����ʷ��־
	i�������ͻ��git merge --no-ff fix-B
		1����ʾ��ͻ��
		   Auto-merging README.md
		   CONFLICT (content): Merge conflict in README.md---��ͻ���ļ�
	           Recorded preimage for 'README.md'
		   Automatic merge failed; fix conflicts and then commit the result.
		2�������ͻ
		   <<<<<<< HEAD
		   - feature-A
                   =======
                   - fix-B
                   >>>>>>> fix-B
                   ======= ���ϵĲ����ǵ�ǰ HEAD �����ݣ����µĲ�����Ҫ�ϲ��� fix-B ��֧�е����ݡ������ڱ༭���н���ĳ���Ҫ�����ӡ�
		3���ύ
		   ��ͻ�����ִ�� git add������ git commit���
	j��git?commit?--amend�����޸��ύ��Ϣ
		����Զ����ı��༭�������Ϸ������޸ľͿ����ˡ�
		��ִ�� git log --graph����鿴�޸���־
	k��git?rebase?-i����ѹ����ʷ
		�ںϲ����Է�֧֮ǰ������������ύ����������Щ��ƴд����ȣ������ύһ���޸ģ�Ȼ������޸İ�����ǰһ���ύ֮�У�ѹ����һ����ʷ��¼��
		��git rebase -i HEAD~2��ѡ����ǰ��֧�а���HEAD�������ύ�����ڵ�����������ʷ��¼Ϊ���󣬲��ڱ༭���д�
		��git rebase --abort
		��git rebase -i master~1 #���һ��
		��git rebase -i master~5 #������
		��git rebase -i HEAD~3   #��ǰ�汾�ĵ���������״̬
		��git rebase -i 32e0a87f #ָ����SHAλ��

11��������Զ�ֿ̲�
	a������github��������һ���ֿ⣬��Ҫ����README�ļ�
	b��git?remote?add�������Զ�ֿ̲�
	   git remote add origin����ʶ���� �ֿ�·��
	c��git?push����������Զ�ֿ̲�
	   1���е���Ӧ��ִ֧��ָ��git push -u origin master
		������ִ�� git push�����ǰ��֧�����ݾͻᱻ���͸�Զ�ֿ̲�origin �� master ��֧�� -u�������������͵�ͬʱ���� origin �ֿ�� master ��֧����Ϊ���زֿ⵱ǰ��֧�� upstream�����Σ������������������������� git pull�����Զ�ֿ̲��ȡ����ʱ�����زֿ�������֧�Ϳ���ֱ�Ӵ� origin �� master ��֧��ȡ���ݣ�ʡȥ��������Ӳ������鷳��ִ�иò����󣬵�ǰ���زֿ� master ��֧�����ݽ��ᱻ���͵�
GitHub ��Զ�ֿ̲��С��� GitHub ��Ҳ����ȷ��Զ�� master ��֧�����ݣ��ͱ��� master ��֧��ͬ��
		���������$ git remote add origin git@github.com:csiichao/git-tutorial.git 
    		  ��ʾ������Ϣ��fatal: remoteorigin already exists.���������
			��git remote rm origin
			��git remote add origin git@github.com:csiichao/git-tutorial.git
				�����������Խ����������������
				git init
				git add README.md
				git commit -m "first commit"
				git remote add origin https://github.com/focusor/focusor.github.io.git
				git push -u origin master
		���������$ git push -u origin master����ʾ������������Ҫ���Ŀ¼�Ƿ���ȷ���ݴ���û���ļ� ��
			error: src refspec master does not match any.
			error: failed to push some refs to 'git@github.com:csiichao/git-tutorial.git'
	d�������� master ����ķ�֧
		�񱾵زֿ��д��� feature-D ��֧	
			ָ�git checkout -b feature-D
		���ڽ��� push ��Զ�ֿ̲Ⲣ���ַ�֧���Ʋ���
			git push -u origin feature-D
	d����Զ�ֿ̲��ȡ
		��Ŀ¼�½�һ�����زֿ�
			mkdir git-tutorial-hello
		���ȡԶ�ֿ̲�
			1��git clone git@github.com:csiichao/git-tutorial.git
			2��ִ�� git clone��������ǻ�Ĭ�ϴ��� master ��֧�£�ͬʱϵͳ���Զ��� origin ���óɸ�Զ�ֿ̲�ı�ʶ����Ҳ����˵����ǰ���زֿ�� master ��֧�� GitHub ��Զ�ֿ̲⣨ origin���� master ��֧������������ȫ��ͬ�ġ�
		��鿴��ǰ��֧�������Ϣ
			git branch -a
		���ȡԶ�̵� feature-D ��֧
			1���� feature-D ��֧��ȡ�����زֿ⡣
				ָ�git checkout -b feature-D origin/feature-D
			2�����ͣ�
				b �����ĺ����Ǳ��زֿ����½���֧�����ơ�
				 origin/feature-D���½���֧���ƺ����ǻ�ȡ��Դ�ķ�֧����
		���򱾵ص�feature-D��֧ �ύ����
			1��git diff
			2���ύ--git commit -am "Add feature-D"
		������feature-D��֧
			1��git push
		���ȡ���µ�Զ�ֿ̲��֧
			1��git pull origin feature-D		
	e���������������� Git ������
		��Pro?Git
		��LearnGitBranching
		��tryGit

12����ϸ��˵GitHub�Ĺ���
	�ⲿ����Ҫ��ҳ���ʹ�ý̳�

13��eclipse Git�ύ����
	a.���ȹ�������git����װ��Ȼ�������û���Ϣ������Ŀ¼���һ���Git Bash Here����git����ڣ�
		��git config --global user.name "you name"
		��git config --global user.email "you@youdomain.example.com"
	b.��¼github������ע�����github�˺ţ�����SSH Key ���ڽ�������Ŀ�ϴ���Զ��github��
		�񴴽�SSH Key��ssh-keygen -t rsa -C "youemail@example.com"
		������ɵĹ�Կ���Ƶ�github��
	c.�������زֿ��硰testGit����Ȼ��ѡ�иñ��زֿ��һ���Git Bash Here�� ִ����������:(ע��ֿ�������Ӣ��)
		��������github�ϴ���һ���ֿ⣬�ֿ���Ϊ��testGit��(Զ�ֿ̲��������뱾�زֿ���һ�£������ύʧ�ܣ����ֿⲻ����)������Զ�ֿ̲��������ο����ڡ�testGit���������һ���Git bash Here�������������
		��git init,��ʼ���ֿ⡰testGit���������Ŀ¼���Git���Թ���Ĳֿ�,�ڸ�Ŀ¼�»�����һ�������ļ���.git��
		��touch .gitignore  git�ύ���Բ���Ҫ���ļ��л��ļ�
		��git add . ��������ļ�(add�롰.��֮���пո񣬷���ʶ����﷨���ύ�����ļ�)
		��git commit -a -m 'version 1.2'    �ύ�����޸��ļ�
		��git remote add origin git@github.com:somenone/testGit.git      �ύԶ�ֿ̲�(��SSH����ʽ������һ��Զ�ֿ̲�)
		��git push -u origin master       ����Զ�ֿ̲�
		��֮��ִ�о��� git push origin master
��ע������Զ�̿��ǿյģ����ǵ�һ������master��֧ʱ��������-u������Git������ѱ��ص�master��֧�������͵�Զ���µ�master��֧������ѱ��ص�master��֧��Զ�̵�master��֧�������������Ժ�����ͻ�����ȡʱ�Ϳ��Լ����
	
����������������ȥ���fatal: refusing to merge unrelated histories

����Github�½�һ���ֿ⣬д��License��Ȼ��ѱ���һ��д�˺ܾòֿ��ϴ���
��pull����Ϊ�����ֿⲻͬ������refusing to merge unrelated histories���޷�pull
��Ϊ������������ͬ����Ŀ��Ҫ��������ͬ����Ŀ�ϲ���git��Ҫ���һ����룬��git pull��
����������git 2.9.2�汾�����ģ����µİ汾��Ҫ���--allow-unrelated-histories
git pull origin master --allow-unrelated-histories








