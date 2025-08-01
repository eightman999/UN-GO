# .enigm ファイル仕様

`MinimGUI` で読み込める `.enigm` ファイルの形式についてまとめます。

## 基本フォーマット

- 1 行ごとに 1 つの変換規則を記述します。
- 行頭が `-` で始まる行のみが変換規則として解釈されます。
- 規則は `- <文字>, <コード>` の形で記述します。
  - `<文字>` は 1 文字。
  - `<コード>` は任意の文字列で、空白はトリムされます。
  - 3 番目以降の要素や末尾のカンマは無視されます。
- `-` で始まらない行はコメントとして無視されます。

## 例

```
- a, 00001
- b, 00010
- c, 00011
```

上記の例では `a` が `00001`、`b` が `00010`、`c` が `00011` に
変換されます。

## 復号処理

読み込んだコードは長い順にソートされ、復号時には入力文字列の
先頭から一致するコードを探して対応する文字に置き換えます。
一致しない部分はそのまま残ります。

サンプルとして本リポジトリには `enigman.enigm` が含まれています。
