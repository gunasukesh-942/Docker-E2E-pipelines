def call (string branch,string repo) {
git branch: "${branch}", url: "${repo}"
sh 'echo "hello world"'
}
