config.devServer.port = 8081;

config.devServer.proxy = {
    '/': 'http://localhost:8080'
};

config.devServer.watchOptions = {
    // To avoid "ENOENT no such file or directory" error
    aggregateTimeout: 300,
    poll: 1000
};
