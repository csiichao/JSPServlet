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
- git remote add——添加远程仓库  
	- git remote add origin（标识符） 仓库路径  
- git push——推送至远程仓库  
	> 切到对应分支执行指令git push -u origin master像这样执行 git push命令，当前分支的内容就会被推送给远程仓库origin 的 master 分支。 -u参数可以在推送的同时，将 origin 仓库的 master 分支设置为本地仓库当前分支的 upstream（上游）。添加了这个参数，将来运行 git pull命令从远程仓库获取内容时，本地仓库的这个分支就可以直接从 origin 的 master 分支获取内容，省去了另外添加参数的麻烦。执行该操作后，当前本地仓库 master 分支的内容将会被推送到  	>GitHub 的远程仓库中。在 GitHub 上也可以确认远程 master 分支的内容，和本地 master 分支相同。
