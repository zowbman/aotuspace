$(function(){
	if($('.at_r-button').length){
		$('.at_r-button').on('click','a',function(){
			var _sku_ul,
			_selectSkuCount=0,_selectSkuPId=[];
			_sku_ul=$('.ui-sku-check').find('ul');
			$.each(_sku_ul,function(i,t){
				$.each($(t).find('li'),function(j,t1){
					if($(t1).find('span').attr('class')=='js-seleted'){
						_selectSkuCount+=1;
						_selectSkuPId.push($(t1).attr('sp-value'));
					}
				});
			});
			
			if(!_selectSkuCount||_selectSkuCount==0||_selectSkuCount<_sku_ul.length){//sku valid
				alert('');
				return false;
			}
			
			var _represent_id,_represent_anId;
			_represent_id=g_config.represent.id;
			_represent_anId=g_config.represent.anId;
			if(!_represent_id||!_represent_anId){
				alert('');
				return false;
			}
			
			var data={
					spTreaTaskC:{
						spId:_represent_id
					},
					skuProId:_selectSkuPId,
					buyCount:$('#ui-porductDd__amountNum').val()
			}
			var cls = $(this).attr('class');
			
			switch(cls){
				case 'sp_linkBuy':
					$.ajax({
						contentType: 'application/json; charset=utf-8', 
						type : 'POST',
						url : '/aotuspace/shopping/'+_represent_id,
						data: JSON.stringify(data),
						success : function(data) {
							location.href='/aotuspace/shopping/'+_represent_anId+'/'+_represent_id+'!fastBuy';
						}
					});
				break;
				case 'sp_linkBuyCar':
					$.ajax({
						contentType: 'application/json; charset=utf-8', 
						type : 'POST',
						url : '/aotuspace/shopping/'+_represent_id,
						data: JSON.stringify(data),
						success : function(data) {
							$.ajax({
								contentType: 'application/json; charset=utf-8', 
								type : 'POST',
								url : '/aotuspace/shopping/'+_represent_anId+'/'+_represent_id+'!buyCar',
								success : function(data) {
									if(data.spCode==100000){
										alert('添加购物车成功！');
									}
								}
							});
						}
					});
				break;
			}
		});
	}
});
