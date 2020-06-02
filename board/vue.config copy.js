module.exports = {
    publicPath: './',
    configureWebpack: {
      devtool: 'source-map'
    },
    devServer: {
        proxy: "http://localhost:8080"
    }
  }
  