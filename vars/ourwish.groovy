def call (String branch,String repo) {
git branch: "${branch}", url: "${repo}"
sh 'echo "hello world"'
}
