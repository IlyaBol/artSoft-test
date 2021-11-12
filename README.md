## Автотесты для сайта http://testdoc.torgi223.ru/
<img src="image/ebf1e367df6ea359.png" height="600" width="1000">

# Для запуска тестов используются следующие команды

### Запуск тестов, когда файл remote.properties не заполнен:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* remoteDriverUrl (указываем логин, пароль и адрес удаленного сервера, где будут проходить тесты )
* videoStorage (параметр для сохранения видео)
* threads (количество потоков)
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Запуск тестов, когда файл remote.properties заполнен:
```bash
gradle clean test
```

Генерация отчета Allure:
```bash
allure serve build/allure-results
```


## Видеотчет теста "Контактная форма"
<img src="image/Gif.gif" height="600" width="1000">

