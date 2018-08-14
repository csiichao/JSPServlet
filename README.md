# 初始化用户名
- 文件路径：~/.gitconfig(这里/ 涉及到linux跟windows系统的自动转换，可以通过git config --global core.autocrlf false设置不转换)
	- ~表示当前用户，直接cd ~，在cd到.gitconfig
- 基础操作指令
	- 查看配置列表: git config --list
	- 配置参数，或者直接到文件下修改 
	  > git config --global user.name "输入你的用户名"	  
	  > git config --global user.email "输入你的邮箱"

- 报错及解决
	- 报错：
		> warning: LF will be replaced by CRLF in ......  
		> The file will have its original line endings in your working directory. 
	- 解决方法,执行以下指令   
		> git config --global core.autocrlf false  
		> The file will have its original line endings in your working directory.
