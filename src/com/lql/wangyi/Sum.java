package com.lql.wangyi;

/**
 * Created by LQL on 2017/3/29.
 */
public class Sum {


    public static void main(String[] args) {


        long[] arr10 = {10798857122L,104900419055L,14001412865L,13798592023L,12301968102L,17100142561L,16997232694L,14701624478L,14597426724L,11305102823L,
                11702408956L,12599987520L,7099943127L,16902721729L};
        long sum = 0L;
        for (long item : arr10){
            sum += item;
        }
        System.out.println(sum);

        long sum2 = 0L;
        long[] arr25 = {4098642612L,33899462072L,5411659805L,4311172313L,4605228422L,6007057827L,2897507335L,
                2406823327L,3103730788L,2699911876L,2702876096L,2205290179L,1102446472L,3099711628L};

        for (long item : arr25){
            sum2 += item;
        }
        System.out.println(sum2);



        long[] arr50 = {2481329427L,27709215663L,2404448570L,2099868153L,1815568747L,1602037323L,2017301011L,
                1703094313L,614012975L,802601239L,2209059137L,2010770448L,1603720472L,2316705762L};
        long sum3 = 0L;
        for (long item : arr50){
            sum3 += item;
        }
        System.out.println(sum3);

        long[] arr80 = {1774983760L,17987255828L,1403394598L,1400800257L,1014021233L,900048255L,989066423L,
                1403568449L,903246957L,996929254L,1333023670L,1587098755L,600490297L,1204999814L};
        long sum80 = 0L;
        for (long item : arr80){
            sum80 += item;
        }

        System.out.println(sum80);

        long[] arr100 = {444028947L,6140342964L,607101819L,554271515L,804593583L,576536200L,688664134L,546607443L,
                595198543L,616637665L,541760012L,650375207L,428251842L,713556887L};
        long sum100 = 0L;
        for (long item : arr100){
            sum100 += item;
        }
        System.out.println(sum100);
        System.out.println(sum2 * 1.0/sum);
        System.out.println(sum3 * 1.0 / sum2);
        System.out.println(sum80 * 1.0 / sum3);
        System.out.println(sum100 * 1.0 / sum80);
    }

}
