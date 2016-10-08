var myapp = angular.module('skuApp', ['ui.angularSku']);

myapp.service('skuInfo',['$http','$q',function($http,$q){
	var skuInfo={};
	return {
		getSkuInfo:function(){
			var deferred=$q.defer();
			var _anId=Number($('#anId').val());
			var _commodityId=Number($('#commodityId').val());
			$http.post('/aotuspace/goods/'+_anId+'/'+_commodityId+'!sku/json').then(function(res){
				deferred.resolve(res);
			});
			return deferred.promise;
		}
	}
}]);

myapp.controller('skuController', ['skuInfo','$scope',function (skuInfo,$scope) {
  'use strict';
  
  $scope.type = 'parent';
  
  //库存，价格
  $scope.callback = function(a){
	if($.type(a)=='number'){//数字
		 $scope.count = 0;//如果不是数组，因为整合了价格，所以返回数组，就原先库存
		 $scope.price = 0;
	}else if($.type(a)=='array'){
		 $scope.count = a['count'];
		 $scope.price = a['price'];
		 $('#ui-porductDd__amountNum').val(1);//设置为1
	}
  }
  
  $scope.skuInfo={};
  skuInfo.getSkuInfo().then(function(res){
    $scope.skuInfo=res.data.spData;
  });
  
}]);