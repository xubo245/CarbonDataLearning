## 问题
当在MAC下使用coursera播放吴恩达的Deep Learning学习视频时，报错了：The media could not be loaded, either because the server or network failed or because the format is not supported

## 修复
	vi /etc/hosts
加入：

	52.84.246.90 d3c33hcgiwev3.cloudfront.net 
	52.84.246.252 d3c33hcgiwev3.cloudfront.net 
	52.84.246.144 d3c33hcgiwev3.cloudfront.net 
	52.84.246.72 d3c33hcgiwev3.cloudfront.net 
	52.84.246.106 d3c33hcgiwev3.cloudfront.net 
	52.84.246.135 d3c33hcgiwev3.cloudfront.net 
	52.84.246.114 d3c33hcgiwev3.cloudfront.net 
	52.84.246.90 d3c33hcgiwev3.cloudfront.net 
	52.84.246.227 d3c33hcgiwev3.cloudfront.net

## 结果
coursera视频可以正常播放

## Refer
	【1】https://blog.csdn.net/wangs1996/article/details/77716679 
