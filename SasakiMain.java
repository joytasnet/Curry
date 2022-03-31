import java.util.*;
public class SasakiMain{
	public static void main(String[] args){
		final String[] curry = {"ポーク","ビーフ","チキン"};
		final String[] TOPPINGS ={
			"大根",
			"セロリ",
			"里芋",
			"カブ",
			"ゴーヤ",
			"キュウリ",
			"カツオのたたき",
			"ラム肉",
			"鯖の水煮",
			"ブリ",
			"タコ",
			"ちくわ",
			"魚肉ソーセージ",
			"こんにゃく",
			"ツナ缶",
			"納豆",
			"アボガド",
			"レーズン",
			"あげ玉",
		};
		//質問をしてカレーのベースを決める
		System.out.println("今夜のカレーを決めます");
		System.out.print("ベースとなるカレーを選択してください");
		for(int i=0;i<curry.length;i++){
			System.out.printf("%d:%s",i,curry[i]);
			System.out.printf("%s",i<curry.length-1?",":"");
		}
		System.out.print(">>");
		int base = new Scanner(System.in).nextInt();

		//トッピングが何種類かを聞く
		System.out.print("トッピングは何種類?>");
		int topping = new Scanner(System.in).nextInt();

		//トッピング配列をシャッフル
		for(int i=0;i<TOPPINGS.length-1;i++){
			int index = new Random().nextInt(TOPPINGS.length -i)+i;
			String tmp = TOPPINGS[index];
			TOPPINGS[index] = TOPPINGS[i];
			TOPPINGS[i] = tmp;
		}

		//トッピング数だけ、配列の頭から取り出しながら文字列連結
		String toppingName = "";
		for(int i=0;i<topping;i++){
			toppingName += TOPPINGS[i];
		}

		//結果を表示する
		System.out.printf("今夜のカレーは「%s%sカレー」に決まりました！",toppingName,curry[base]);
	}
}
