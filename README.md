# UN-GO

このリポジトリは Java で書かれた簡易的な文字列暗号化プログラムのソースコードです。

## 内容

`src/com/company` ディレクトリに各種クラスが含まれており、主なエントリーポイントは `Main.java` です。入力された文字列を独自の規則で暗号化し、結果をファイルに出力する処理を行います。復号用の `REDO.java` など補助クラスも同梱されています。

## コンパイルと実行

1. Java コンパイラを使用してソースをコンパイルします。

```bash
javac -d out src/com/company/*.java
```

2. `Main` クラスを実行します。

```bash
java -cp out com.company.Main
```

生成された数値列を復号するには `SimpleDecoder` を使用できます。

```bash
echo "140169176176179999187179182176168" | \
    java -cp out com.company.SimpleDecoder
```

※ Java 8 以降の環境で動作確認を行っています。

## ライセンス

本リポジトリは「DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE (WTFPL)」で公開されています。
詳細は同梱の `LICENSE` ファイルをご覧ください。
