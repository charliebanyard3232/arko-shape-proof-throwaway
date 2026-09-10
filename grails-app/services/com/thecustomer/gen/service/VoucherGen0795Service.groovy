// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen0795Service {

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
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 3374 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 5760 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 1223 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 1753 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 2530 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 3952 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 5630 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 3746 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 2639 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 3765 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 5254 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 2943 }
    /** Derived accessor for version (generated filler). */
    def computeVersion12() { return 3922 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 4914 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg14() { return 1692 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg15() { return 1416 }
}
