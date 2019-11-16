package com.example.recyclerview08102019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MonanAdapter monanAdapter;
    ArrayList<Monan> monanArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        monanArrayList = new ArrayList<>();

        monanArrayList.add(new Monan("Buzza Pizza - Nguyễn Trung Trực", "Tầng 3, 5-7-9 Nguyễn Trung Trực, P. Bến Thành, Quận 1, TP. HCM", R.drawable.monan_buzza_pizza));
        monanArrayList.add(new Monan("Morico - Contemporary Japanese Lifestyle - Lê Lợi", "30 Lê Lợi, P. Bến Nghé, Quận 1, TP. HCM", R.drawable.monan_morico));
        monanArrayList.add(new Monan("Paris Baguette - Cao Thắng", "1 Cao Thắng, P. 2, Quận 3, TP. HCM", R.drawable.monan_paris_baguette));
        monanArrayList.add(new Monan("San Fu Lou - Ẩm Thực Quảng Đông - Lê Lai", "Tầng Trệt, AB Tower, 76A Lê Lai, Quận 1, TP. HCM", R.drawable.monan_sanfulou));
        monanArrayList.add(new Monan("Monkey In Black Cafe - Sư Vạn Hạnh", "698 Sư Vạn Hạnh, Quận 10, TP. HCM", R.drawable.monan_tradao));

        monanAdapter = new MonanAdapter(monanArrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(monanAdapter);


    }
}
