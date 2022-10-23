goal_mysql_start() {
  docker run --detach --env MYSQL_ROOT_PASSWORD=sorravit --env MYSQL_USER=sorravit --env MYSQL_PASSWORD=sorravit --env MYSQL_DATABASE=big --name mysql --publish 3302:3306 mysql
}

if type "goal_$1" &>/dev/null; then
  "goal_$1" "${@:-2}"
else
  echo "usage: $0 <goal>
    goal:
        mysql_start               -- start mysql server with a
        "
  exit 1
fi
