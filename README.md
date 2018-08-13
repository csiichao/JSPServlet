#first README
1、git输出设置文件路径：C:\Users\Administrator\.gitconfig

2、git生成秘钥
	ssh-keygen -t rsa -C "18651882867@163.com"
(/c/Users/Administrator/.ssh/id_rsa)
密码：082499wu
连接github
ssh -T git@github.com

3、提示成功但是还是有问题，暂时不管，第一行提示输入ssh设置的密码
Enter passphrase for key '/c/Users/Administrator/.ssh/id_rsa':
Hi csiichao! You've successfully authenticated, but GitHub does not provide shell access.

4、下载代码到本地，默认下到git安装目录
 git clone 分支地址

5、切换到代码库
 cd Hello-World

6、建立一个目录并初始化仓库（创建目录，然后初始化）。

	a、新建目录及本地仓库
		●$ mkdir git-tutorial
		●$ cd git-tutorial
	b、初始化git仓库
		●$ git init
			执行结果：Initialized empty Git repository in /Users/hirocaster/github/github-book/git-tutorial/.git/
	如果初始化成功，执行了 git init命令的目录下就会生成 .git 目录。
	c、添加文件，对文件操作的指令跟linux一样
	touch hello_world.java

7、获取文件是否提交状态
 git status
如：表示未添加到Git仓库
# On branch master
# Untracked files:
# (use "git add <file>..." to include in what will be committed)
#
# hello_world.php
nothing added to commit but untracked files present (use "git add" to track)

8、提交代码
   git add命令是个多功能命令，根据目标文件的状态不同，此命令的效果也不同：可以用它开始跟踪新文件，或者把已跟踪的文件放到暂存区，还能   用于合并时把有冲突的文件标记为已解决状态等

我们需要用git add命令来跟踪新文件，但如果使用git commit -am可以省略使用git add命令将已跟踪文件放到暂存区的功能
   通过 git add命令将文件加入暂存区 A，再通过 git commit命令提交。
   a、git add 文件名
   b、git commit -m "Add hello world script by java"  ，
   c、git log命令查看提交日志


9、git基本操作
  a、git?init——初始化仓库，ls -lah可以看到
	执行了 git init命令的目录下就会生成 .git 目录，存储着管理当前目录内容所需的仓库数据
  b、git?status——查看仓库的状态
	 新建的文件未进行任何操作会提示Untracked files，如果只是用 Git 仓库的工作树创建了文件，那么该文件并不会被记入 Git 仓库的版本管理对象当中，要想让文件成为 Git 仓库的管理对象，就需要用 git add命令将其加入暂存区（ Stage 或者 Index）中。暂存区是提交之前的一个临时区域。
  c、git?add——向暂存区中添加文件
	将 README.md 文件加入暂存区后，git status命令的显示结果发生了变化。可以看到，README.md文件显示在 Changes to be committed中。
  d、git?commit——保存仓库的历史记录（git commit -m "First commit"）
	-m 参数后的 "First commit"称作提交信息，是对这个提交的概述；不加 -m，直接执行 git commit命令。执行后编辑器就会启动，可以手动写详细提交信息，格式如下：
	● 第一行：用一行文字简述提交的更改内容
	● 第二行：空行
	● 第三行以后：记述更改的原因和详细内容
  e、git?log——查看提交日志
	●只显示提交信息的第一行——git log --pretty=short
	●只显示指定目录、文件的日志——git log 目录名、文件名
	●显示文件的改动——git log -p 文件名
	●查看更改前后的差别——git?diff
		1、查看工作树和暂存区的差别，git?diff，此时未执行git add，可显示差别
		2、查看工作树和最新提交的差别——git?diff HEAD。
			执行git add后，git?diff不显示差别（由于工作树和暂存区的状态并无差别，不显示任何结果。）

10、分支的操作
	a、git?branch——显示分支一览表
	b、git?checkout?-b——创建、切换分支
		●创建名为 feature-A 的分支并切换到分支--git checkout -b feature-A
			或git branch feature-A（创建分支）---> git checkout feature-A（切换分支）
		●切换到 master 分支——git checkout master
		●切换回上一个分支——git checkout - 或git checkout 分支名
	c、特性分支
		特性分支（Topic）顾名思义，是集中实现单一特性（主题），除此之外不进行任何作业的分支。在日常开发中，往往会创建数个特性分支，同时在此之外再保留一个随时可以发布软件的稳定分支。稳定分支的角色通常由 master 分支担当。
		之前我们创建了 feature-A 分支，这一分支主要实现 feature-A，除feature-A 的实现之外不进行任何作业。即便在开发过程中发现了 BUG，也需要再创建新的分支，在新分支中进行修正。
		基于特定主题的作业在特性分支中进行，主题完成后再与 master 分支合并。只要保持这样一个开发流程，就能保证 master 分支可以随时供人查看。这样一来，其他开发者也可以放心大胆地从 master 分支创建新的特性分支。
	d、主干分支
		主干分支是刚才我们讲解的特性分支的原点，同时也是合并的终点。通常人们会用 master 分支作为主干分支。主干分支中并没有开发到一半的代码，可以随时供他人查看。有时我们需要让这个主干分支总是配置在正式环境中，有时又需要用标签 Tag 等创建版本信息，同时管理多个版本发布。拥有多个版本发布时，主干分支也有多个。
	e、git?merge——合并分支
		●首先切换到 master 分支——git checkout master
		●git merge --no-ff feature-A，随后编辑器会启动，用于录入合并提交的信息，核对保存并退出。
	f、git?log?--graph——以图表形式查看分支
	g、git?reset——回溯历史版本
		●1、git log 获取目标时间点的哈希值
		●git rest --hard 时间点的哈希值——恢复至该时间点的状态
	h、git reflog——查看当前仓库执行过的操作的日志
		git log命令只能查看以当前状态为终点的历史日志
	i、解决冲突，git merge --no-ff fix-B
		1、提示冲突：
		   Auto-merging README.md
		   CONFLICT (content): Merge conflict in README.md---冲突的文件
	           Recorded preimage for 'README.md'
		   Automatic merge failed; fix conflicts and then commit the result.
		2、解决冲突
		   <<<<<<< HEAD
		   - feature-A
                   =======
                   - fix-B
                   >>>>>>> fix-B
                   ======= 以上的部分是当前 HEAD 的内容，以下的部分是要合并的 fix-B 分支中的内容。我们在编辑器中将其改成想要的样子。
		3、提交
		   冲突解决后，执行 git add命令与 git commit命令。
	j、git?commit?--amend——修改提交信息
		●会自动打开文本编辑器，最上方进行修改就可以了。
		●执行 git log --graph命令，查看修改日志
	k、git?rebase?-i——压缩历史
		在合并特性分支之前，如果发现已提交的内容中有些许拼写错误等，不妨提交一个修改，然后将这个修改包含到前一个提交之中，压缩成一个历史记录。
		●git rebase -i HEAD~2，选定当前分支中包含HEAD（最新提交）在内的两个最新历史记录为对象，并在编辑器中打开
		●git rebase --abort
		●git rebase -i master~1 #最后一次
		●git rebase -i master~5 #最后五次
		●git rebase -i HEAD~3   #当前版本的倒数第三次状态
		●git rebase -i 32e0a87f #指定的SHA位置

11、推送至远程仓库
	a、先在github官网创建一个仓库，不要创建README文件
	b、git?remote?add——添加远程仓库
	   git remote add origin（标识符） 仓库路径
	c、git?push——推送至远程仓库
	   1、切到对应分支执行指令git push -u origin master
		像这样执行 git push命令，当前分支的内容就会被推送给远程仓库origin 的 master 分支。 -u参数可以在推送的同时，将 origin 仓库的 master 分支设置为本地仓库当前分支的 upstream（上游）。添加了这个参数，将来运行 git pull命令从远程仓库获取内容时，本地仓库的这个分支就可以直接从 origin 的 master 分支获取内容，省去了另外添加参数的麻烦。执行该操作后，当前本地仓库 master 分支的内容将会被推送到
GitHub 的远程仓库中。在 GitHub 上也可以确认远程 master 分支的内容，和本地 master 分支相同。
		●如果输入$ git remote add origin git@github.com:csiichao/git-tutorial.git 
    		  提示出错信息：fatal: remoteorigin already exists.解决方法：
			●git remote rm origin
			●git remote add origin git@github.com:csiichao/git-tutorial.git
				上述两部可以解决，解决不了用这个
				git init
				git add README.md
				git commit -m "first commit"
				git remote add origin https://github.com/focusor/focusor.github.io.git
				git push -u origin master
		●如果输入$ git push -u origin master，提示下面的这个，需要检查目录是否正确，暂存区没有文件 。
			error: src refspec master does not match any.
			error: failed to push some refs to 'git@github.com:csiichao/git-tutorial.git'
	d、推送至 master 以外的分支
		●本地仓库中创建 feature-D 分支	
			指令：git checkout -b feature-D
		●在将它 push 给远程仓库并保持分支名称不变
			git push -u origin feature-D
	d、从远程仓库获取
		●换目录新建一个本地仓库
			mkdir git-tutorial-hello
		●获取远程仓库
			1、git clone git@github.com:csiichao/git-tutorial.git
			2、执行 git clone命令后我们会默认处于 master 分支下，同时系统会自动将 origin 设置成该远程仓库的标识符。也就是说，当前本地仓库的 master 分支与 GitHub 端远程仓库（ origin）的 master 分支在内容上是完全相同的。
		●查看当前分支的相关信息
			git branch -a
		●获取远程的 feature-D 分支
			1、将 feature-D 分支获取至本地仓库。
				指令：git checkout -b feature-D origin/feature-D
			2、解释：
				b 参数的后面是本地仓库中新建分支的名称。
				 origin/feature-D，新建分支名称后面是获取来源的分支名称
		●向本地的feature-D分支 提交更改
			1、git diff
			2、提交--git commit -am "Add feature-D"
		●推送feature-D分支
			1、git push
		●获取最新的远程仓库分支
			1、git pull origin feature-D		
	e、帮助大家深入理解 Git 的资料
		●Pro?Git
		●LearnGitBranching
		●tryGit

12、详细解说GitHub的功能
	这部分主要是页面的使用教程

13、eclipse Git提交代码
	a.首先官网下载git并安装，然后配置用户信息（任意目录下右击“Git Bash Here”打开git命令窗口）
		●git config --global user.name "you name"
		●git config --global user.email "you@youdomain.example.com"
	b.登录github官网，注册个人github账号，创建SSH Key 用于将本地项目上传至远程github上
		●创建SSH Key：ssh-keygen -t rsa -C "youemail@example.com"
		●把生成的公钥复制到github上
	c.创建本地仓库如“testGit”，然后选中该本地仓库右击“Git Bash Here” 执行如下命令:(注意仓库名称用英文)
		●首先在github上创建一个仓库，仓库名为“testGit”(远程仓库名必须与本地仓库名一致，否则提交失败，报仓库不存在)，创建远程仓库具体操作参考：在“testGit”工程上右击“Git bash Here”输入如下命令：
		●git init,初始化仓库“testGit”即把这个目录变成Git可以管理的仓库,在该目录下会生成一个隐藏文件“.git”
		●touch .gitignore  git提交忽略不必要的文件夹或文件
		●git add . 添加所有文件(add与“.”之间有空格，否则不识别的语法，提交所有文件)
		●git commit -a -m 'version 1.2'    提交所有修改文件
		●git remote add origin git@github.com:somenone/testGit.git      提交远程仓库(用SSH的形式，关联一个远程仓库)
		●git push -u origin master       推送远程仓库
		●之后执行就是 git push origin master
备注：由于远程库是空的，我们第一次推送master分支时，加上了-u参数，Git不但会把本地的master分支内容推送的远程新的master分支，还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时就可以简化命令。
	
报错及解决方法：如何去解决fatal: refusing to merge unrelated histories

我在Github新建一个仓库，写了License，然后把本地一个写了很久仓库上传。
先pull，因为两个仓库不同，发现refusing to merge unrelated histories，无法pull
因为他们是两个不同的项目，要把两个不同的项目合并，git需要添加一句代码，在git pull，
这句代码是在git 2.9.2版本发生的，最新的版本需要添加--allow-unrelated-histories
git pull origin master --allow-unrelated-histories








