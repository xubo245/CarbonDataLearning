Change thrift latest version to thrift 0.9.3 version in MacBook 

## prepare
brew exists in mac

## remove latest thrift
brew unintall thrift

	localhost:carbondata1 xubo$ brew uninstall thrift
	Uninstalling /usr/local/Cellar/thrift/0.11.0... (102 files, 7MB)
The latest version of thrift is 0.11.0 in mac

## change the thrift version

	brew edit thrift
Change

	url "https://www.apache.org/dyn/closer.cgi?path=/thrift/0.11.0/thrift-0.11.0.tar.gz"
	sha256 "c4ad38b6cb4a3498310d405a91fef37b9a8e79a50cd0968148ee2524d2fa60c2"
To
 
	  url "https://www.apache.org/dyn/closer.cgi?path=/thrift/0.9.3/thrift-0.9.3.tar.gz"
	  sha256 "b0740a070ac09adde04d43e852ce4c320564a292f26521c46b78e0641564969e"


Save

## install
	
	localhost:carbondata1 xubo$ brew install thrift
	Updating Homebrew...
	==> Auto-updated Homebrew!
	Updated Homebrew from 0f65758f8 to b088302e1.
	Updated 2 taps (homebrew/core, homebrew/cask).
	==> Updated Formulae
	cmake ✔               bazel                 dscanner              git-town              jenkins-job-builder   midnight-commander    percona-server@5.6    pstoedit              typescript
	tbb ✔                 cake                  duck                  glm                   jetty                 mill                  php-cs-fixer          pygobject3            urh
	acpica                calabash              etcd                  gosu                  jetty-runner          mongo-c-driver        phpunit               qmmp                  winetricks
	agda                  calicoctl             exomizer              groovysdk             kops                  mp3gain               pike                  rubberband            wireguard-go
	annie                 cdrdao                fantom                h2o                   lego                  nano                  pkcs11-helper         ruby-build            wireguard-tools
	ansible               collector-sidecar     fio                   hadoop                libdca                nativefier            pony-stable           saxon                 youtube-dl
	aws-sdk-cpp           compcert              fn                    heroku                libplctag             openimageio           ponyc                 shellcheck
	awscli                conan                 frugal                hopenpgp-tools        libpqxx               parallelstl           ppsspp                sqlmap
	bash                  convox                fselect               imagemagick           logcheck              pegtl                 presto                storm
	bat                   django-completion     fstar                 imagemagick@6         menhir                percona-server        proj                  teleport
	
	==> Downloading https://homebrew.bintray.com/bottles/thrift-0.9.3.high_sierra.bottle.tar.gz
	
	curl: (22) The requested URL returned error: 404 Not Found
	Error: Failed to download resource "thrift"
	Download failed: https://homebrew.bintray.com/bottles/thrift-0.9.3.high_sierra.bottle.tar.gz
	Warning: Bottle installation failed: building from source.
	==> Installing dependencies for thrift: bison
	==> Installing thrift dependency: bison
	==> Downloading https://homebrew.bintray.com/bottles/bison-3.0.5.high_sierra.bottle.tar.gz
	######################################################################## 100.0%
	==> Pouring bison-3.0.5.high_sierra.bottle.tar.gz
	==> Caveats
	This formula is keg-only, which means it was not symlinked into /usr/local,
	because some formulae require a newer version of bison.
	
	If you need to have this software first in your PATH run:
	  echo 'export PATH="/usr/local/opt/bison/bin:$PATH"' >> ~/.bash_profile
	
	For compilers to find this software you may need to set:
	    LDFLAGS:  -L/usr/local/opt/bison/lib
	
	==> Summary
	🍺  /usr/local/Cellar/bison/3.0.5: 52 files, 2.1MB
	==> Downloading https://www.apache.org/dyn/closer.cgi?path=/thrift/0.9.3/thrift-0.9.3.tar.gz
	==> Best Mirror http://www-us.apache.org/dist/thrift/0.9.3/thrift-0.9.3.tar.gz
	######################################################################## 100.0%
	==> ./configure --prefix=/usr/local/Cellar/thrift/0.9.3 --libdir=/usr/local/Cellar/thrift/0.9.3/lib --with-openssl=/usr/local/opt/openssl --without-ruby --disable-tests --without-php_extension --without-p
	==> make
	==> make install
	==> Caveats
	To install Ruby binding:
	  gem install thrift
	==> Summary
	🍺  /usr/local/Cellar/thrift/0.9.3: 95 files, 5.7MB, built in 5 minutes 19 seconds
	localhost:carbondata1 xubo$ thrift -version
	Thrift version 0.9.3
	
More information:

[1] [https://github.com/xubo245/CarbonDataLearning](https://github.com/xubo245/CarbonDataLearning)

Refer

	[1] https://github.com/apache/carbondata
	[2] https://www.jianshu.com/p/aadb54eac0a8