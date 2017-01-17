## Functional Programming in  Dotty

### 必备条件

Dotty还没有正式发布，所以，先这样安装dotty
```shell
git clone https://github.com/lampepfl/dotty.git
cd dotty
sbt publishLocal
```

### Usage

This is a normal sbt project, you can compile code with `sbt compile` and run it
with `sbt run`, `sbt console` will start a Dotty REPL.

If compiling this example project fails, you probably have a global sbt plugin
that does not work with dotty, try to disable all plugins in
`~/.sbt/0.13/plugins` and `~/.sbt/0.13`.

### Using Dotty in your own project

1. [Use sbt 0.13.11 (other versions are not supported)](https://github.com/smarter/dotty-example-project/blob/master/project/build.properties).
2. Configure your build like explained in [build.sbt](https://github.com/smarter/dotty-example-project/blob/master/build.sbt#L7-L8)

### Discuss

Feel free to come chat with us on the
[Dotty gitter](http://gitter.im/lampepfl/dotty)!
