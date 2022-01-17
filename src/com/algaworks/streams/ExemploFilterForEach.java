package com.algaworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.streams.model.Produto;
import com.algaworks.streams.model.Produto.Status;

public class ExemploFilterForEach {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto ("Agua 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto ("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto ("Carvão", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto ("Cereveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto ("Cupin 2kg", Status.ATIVO, new BigDecimal(92)));
		
		/*for(Produto produto : produtos) {
			if(produto.getNome().startsWith("C")) {
				produto.inativar();
			}
		}
		
		Predicate<Produto> predicate = p -> p.getNome().startsWith("C");
		//Consumer<Produto> consumer = p -> p.inativar();
		Stream<Produto> produtosStream = produtos.stream();
		produtosStream.forEach(Produto :: inativar);*/
		
		

	produtos.stream()
		.filter(p -> p.getNome().startsWith("C"))
		 .forEach(Produto :: inativar);

	}

}
