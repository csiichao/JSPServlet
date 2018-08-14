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
> From github.com:csiichao/JSPServlet
branch            master     -> FETCH_HEAD
error: Your local changes to the following files would be overwritten by merge:
BodyDemo/.classpath
BodyDemo/.settings/org.eclipse.wst.common.project.facet.core.xml
BodyDemo/WebContent/upload.html
> Please commit your changes or stash them before you merge.  
----上述表示已add但没有commit

> error: The following untracked working tree files would be overwritten by merge:
BodyDemo/build/classes/cc/openhome/UploadServlet$Position.class
BodyDemo/build/classes/cc/openhome/UploadServlet.class
BodyDemo/src/cc/openhome/UploadServlet.java
README.md
> Please move or remove them before you merge.  
----上述表示未add   

- git push——推送至远程仓库  
> 切到对应分支执行指令git push -u origin master像这样执行 git push命令，当前分支的内容就会被推送给远程仓库origin 的 master 分支。 -u参数可以在推送的同时，将 origin 仓库的 master 分支设置为本地仓库当前分支的 upstream（上游）。添加了这个参数，将来运行 git pull命令从远程仓库获取内容时，本地仓库的这个分支就可以直接从 origin 的 master 分支获取内容，省去了另外添加参数的麻烦。执行该操作后，当前本地仓库 master 分支的内容将会被推送到GitHub 的远程仓库中。在 GitHub 上也可以确认远程 master 分支的内容，和本地 master 分支相同。

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
>特性分支（Topic）顾名思义，是集中实现单一特性（主题），除此之外不进行任何作业的分支。在日常开发中，往往会创建数个特性分支，同时在此之外再保留一个随时可以发布软件的稳定分支。稳定分支的角色通常由 master 分支担当。
之前我们创建了 feature-A 分支，这一分支主要实现 feature-A，feature-A 的实现之外不进行任何作业。即便在开发过程中发现了 BUG，也需要再创建新的分支，在新分支中进行修正。
基于特定主题的作业在特性分支中进行，主题完成后再与 master 分支合并。只要保持这样一个开发流程，就能保证 master 分支可以随时供人查看。这样一来，其他开发者也可以放心大胆地从 master 分支创建新的特性分支。
