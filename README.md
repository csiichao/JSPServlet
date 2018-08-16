# 初始化用户名
- 文件路径：~/.gitconfig(这里/ 涉及到linux跟windows系统的自动转换，可以通过git config --global core.autocrlf false设置不转换)
	- ~表示当前用户，直接cd ~，在cd到.gitconfig
- 基础操作指令
	- 查看配置列表: git config --list
	- 配置参数，或者直接到文件下修改 
	  > git config --global user.name "输入你的用户名"	  
	  > git config --global user.email "输入你的邮箱"

- 报错及解决
	- 报错：在保存文件时，因为"/"
		> warning: LF will be replaced by CRLF in “文件名”  
		> The file will have its original line endings in your working directory. 
	- 解决方法,执行以下指令   
		> git config --global core.autocrlf false
# 创建一个新的SSH key
- 指令：ssh-keygen -t rsa -C "yourEmail"
- 执行提示及操作
	> Creates a new ssh key using the provided email Generating public/private rsa key pair.  
	#此处输入将要保存的路径，默认为当前路径  
	Enter file in which to save the key (/Users/your_user_directory/.ssh/id_rsa):<press enter>  
	输入回车后提示输入一个类似于密码的自定义的通行证号，如果直接回车则为空  
	Enter passphrase (empty for no passphrase):<enter a passphrase>  
	#提示重新输入以便确认输入是否正确  
	> Enter same passphrase again:<enter passphrase again> 
# 将SSH key在github配置秘钥  
- 路径：~/.ssh/id_rsa.pub
# 验证秘钥是否正确 
> ssh -T git@github.com  
#代码push及pull	
- git remote add——添加远程仓库，相当于连接关联本地与远程仓库  
	- 添加远程仓库：git remote add origin（标识符） 仓库路径
	- 关联本地与远程仓库：git branch --set-upstream-to=origin/remote_branch  your_branch
# 先更新后提交
- 一般情况下提交代码操作
	- git init
	- git add README.md
	- git commit -m "first commit"
	- git remote add origin 远程仓库地址
	- git push -u origin master

- git pull更新：git pull origin master --allow-unrelated-histories  
执行完提示错误信息：  
>　 From github.com:csiichao/JSPServlet
branch            master     -> FETCH_HEAD
error: Your local changes to the following files would be overwritten by merge:
BodyDemo/.classpath
BodyDemo/.settings/org.eclipse.wst.common.project.facet.core.xml
BodyDemo/WebContent/upload.html
> Please commit your changes or stash them before you merge.  
----上述表示已add但没有commit

> 　error: The following untracked working tree files would be overwritten by merge:
BodyDemo/build/classes/cc/openhome/UploadServlet$Position.class
BodyDemo/build/classes/cc/openhome/UploadServlet.class
BodyDemo/src/cc/openhome/UploadServlet.java
README.md
> Please move or remove them before you merge.  
----上述表示未add   

- git push——推送至远程仓库  
> 　　切到对应分支执行指令git push -u origin master像这样执行 git push命令，当前分支的内容就会被推送给远程仓库origin 的 master 分支。 -u参数可以在推送的同时，将 origin 仓库的 master 分支设置为本地仓库当前分支的 upstream（上游）。添加了这个参数，将来运行 git pull命令从远程仓库获取内容时，本地仓库的这个分支就可以直接从 origin 的 master 分支获取内容，省去了另外添加参数的麻烦。执行该操作后，当前本地仓库 master 分支的内容将会被推送到GitHub 的远程仓库中。在 GitHub 上也可以确认远程 master 分支的内容，和本地 master 分支相同。

# 分支操作
- 查看当前分支的相关信息：  
	- git branch -a
- 获取远程的 feature-D 分支
	- 将 feature-D 分支获取至本地仓库。  
	指令：git checkout -b feature-D origin/feature-D
	- 解释：b 参数的后面是本地仓库中新建分支的名称。origin/feature-D，新建分支名称后面是获取来源的分支名称
- 向本地的feature-D分支提交更改，基于分支操作都需要先切到分支下
	- 对比差异：git diff
	- 提交：git commit -am "Add feature-D"
	- 推送feature-D分支：git push
	- 获取最新的远程仓库分支：git pull origin feature-D
	- 帮助大家深入理解 Git 的资料
	- git 配置忽略文件：touch .gitignore
	 - Pro Git
	 - LearnGitBranching
	 - tryGit	
- 创建、切换分支：git checkout -b—
	- 创建名为 feature-A 的分支并切换到分支--git checkout -b -feature-A
	- 或git branch feature-A（创建分支）---> git checkout feature-A（切换分支）
	- 切换到 master 分支——git checkout master
	- 切换回上一个分支——git checkout - 或git checkout 分支名
- 特性分支
>　　特性分支（Topic）顾名思义，是集中实现单一特性（主题），除此之外不进行任何作业的分支。在日常开发中，往往会创建数个特性分支，同时在此之外再保留一个随时可以发布软件的稳定分支。稳定分支的角色通常由 master 分支担当。
之前我们创建了 feature-A 分支，这一分支主要实现 feature-A，feature-A 的实现之外不进行任何作业。即便在开发过程中发现了 BUG，也需要再创建新的分支，在新分支中进行修正。
基于特定主题的作业在特性分支中进行，主题完成后再与 master 分支合并。只要保持这样一个开发流程，就能保证 master 分支可以随时供人查看。这样一  来，其他开发者也可以放心大胆地从 master 分支创建新的特性分支。  

- 主干分支  
>　　主干分支是刚才我们讲解的特性分支的原点，同时也是合并的终点。通常人们会用 master 分支作为主干分支。主干分支中并没有开发到一半的代码，可以随时供他人查看。有时我们需要让这个主干分支总是配置在正式环境中，有时又需要用标签 Tag 等创建版本信息，同时管理多个版本发布。拥有多个版本发布时，主干分支也有多个。

- git merge——合并分支
	- 首先切换到 master 分支——git checkout master
	- git merge --no-ff feature-A，随后编辑器会启动，用于录入合并提交的信息，核对保存并退出。
- git log --graph——以图表形式查看分支
- git reset——回溯历史版本
	- 1、git log 获取目标时间点的哈希值
	- git rest --hard 时间点的哈希值——恢复至该时间点的状态
- git reflog——查看当前仓库执行过的操作的日志
	- git log命令只能查看以当前状态为终点的历史日志
- 解决冲突，git merge --no-ff fix-B
	- 提示冲突：  
	Auto-merging README.md
	CONFLICT (content): Merge conflict in README.md---冲突的文件
	Recorded preimage for 'README.md'
    Automatic merge failed; fix conflicts and then commit the result.
	- 解决冲突  
 	<<<<<<< HEAD
		- feature-A
        =======
        - fix-B
        >>>>>>> fix-B
        ======= 以上的部分是当前 HEAD 的内容，以下的部分是要合并的 fix-B 分支中的内容。我们在编辑器中将其改成想要的样子。
	- 提交  
		- 冲突解决后，执行 git add命令与 git commit命令。
- git commit --amend——修改提交信息
	- 会自动打开文本编辑器，最上方进行修改就可以了。
	- 执行 git log --graph命令，查看修改日志
- git rebase -i——压缩历史  
	> 在合并特性分支之前，如果发现已提交的内容中有些许拼写错误等，不妨提交一个修改，然后将这个修改包含到前一个提交之中，压缩成一个历史记录。
	- git rebase -i HEAD~2，选定当前分支中包含HEAD（最新提交）在内的两个最新历史记录为对象，并在编辑器中打开
	- git rebase --abort
	- git rebase -i master~1 #最后一次
	- git rebase -i master~5 #最后五次
	- git rebase -i HEAD~3   #当前版本的倒数第三次状态
	- git rebase -i 32e0a87f #指定的SHA位置
