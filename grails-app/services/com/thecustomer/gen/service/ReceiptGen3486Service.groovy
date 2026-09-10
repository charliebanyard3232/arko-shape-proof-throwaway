// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen3486Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 5278 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity1() { return 8506 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 9035 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 1138 }
    /** Derived accessor for label (generated filler). */
    def computeLabel4() { return 5569 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 7062 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount6() { return 5009 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 348 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 6341 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 9497 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 4893 }
    /** Derived accessor for code (generated filler). */
    def computeCode11() { return 462 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg12() { return 8549 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 7794 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 8095 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 3486 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId16() { return 7110 }
    /** Derived accessor for priority (generated filler). */
    def computePriority17() { return 2458 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg18() { return 83 }
    /** Derived accessor for label (generated filler). */
    def computeLabel19() { return 9345 }
    /** Derived accessor for label (generated filler). */
    def computeLabel20() { return 5161 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity21() { return 8091 }
    /** Derived accessor for priority (generated filler). */
    def computePriority22() { return 8915 }
    /** Derived accessor for version (generated filler). */
    def computeVersion23() { return 9493 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount24() { return 9235 }
    /** Derived accessor for code (generated filler). */
    def computeCode25() { return 9840 }
    /** Derived accessor for region (generated filler). */
    def computeRegion26() { return 986 }
    /** Derived accessor for weightKg (generated filler). */
}
